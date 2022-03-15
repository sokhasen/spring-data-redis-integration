package com.sokha.demo.springdataredis.infrastructure.adapter;

import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import com.sokha.demo.springdataredis.core.ports.outgoing.UserServiceProvider;
import com.sokha.demo.springdataredis.infrastructure.repository.UserBaseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceAdapter implements UserServiceProvider {

	private final UserBaseRepository repository;


	@Override
	public UserResult handle(GetUserQuery query) {
		return repository.handle(query);
	}

	@Override
	public void handle(SetUserQuery query) {

		repository.handle(query);

	}
}
