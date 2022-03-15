package com.sokha.demo.springdataredis.infrastructure.cache.mapper;

import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import com.sokha.demo.springdataredis.infrastructure.cache.entity.UserCache;
import org.springframework.stereotype.Component;

@Component
public class UserCacheMapperImpl implements UserCacheMapper {

	@Override
	public UserResult from(UserCache cache) {
		return UserResult.of(cache.getId(), cache.getName());
	}

	@Override
	public UserCache from(SetUserQuery query) {
		return UserCache.of(query.getId(), query.getName());
	}

}
