package com.sokha.demo.springdataredis.core;

import com.sokha.demo.springdataredis.core.mapper.UserServiceMapper;
import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import com.sokha.demo.springdataredis.core.ports.incoming.UserService;
import com.sokha.demo.springdataredis.core.ports.outgoing.UserServiceProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceFacade implements UserService {

	private final UserServiceProvider userServiceProvider;
	private final UserServiceMapper userServiceMapper;

	@Override
	public UserReply handle(GetUserCommand command) {
		GetUserQuery query = userServiceMapper.from(command);
		UserResult result = userServiceProvider.handle(query);
		UserReply reply = userServiceMapper.from(result);
		return reply;
	}

	@Override
	public void handle(SetUserCommand command) {
		SetUserQuery query = userServiceMapper.from(command);
		userServiceProvider.handle(query);
	}
}
