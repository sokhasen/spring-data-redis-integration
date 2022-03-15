package com.sokha.demo.springdataredis.infrastructure.repository;

import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import com.sokha.demo.springdataredis.infrastructure.cache.entity.UserCache;
import com.sokha.demo.springdataredis.infrastructure.cache.mapper.UserCacheMapper;
import com.sokha.demo.springdataredis.infrastructure.cache.repository.UserCacheRepository;
import com.sokha.demo.springdataredis.infrastructure.cache.repository.UserHashOpsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDatasourceRepository implements UserBaseRepository {

	private final UserCacheRepository userCacheRepository;
	private final UserCacheMapper userCacheMapper;

	// cache with hash operation
	private final UserHashOpsRepository userHashOpsRepository;

	@Override
	public UserResult handle(GetUserQuery query) {

//		UserCache user = userCacheRepository.findById(query.getId()).orElseThrow();
		UserCache user = userHashOpsRepository.get(query.getId());

		UserResult result = userCacheMapper.from(user);
		return result;
	}

	@Override
	public void handle(SetUserQuery query) {

		UserCache cache = userCacheMapper.from(query);
		userHashOpsRepository.set(cache);

//		userCacheRepository.save(cache);

	}
}
