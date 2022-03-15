package com.sokha.demo.springdataredis.core.mapper;

import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import org.springframework.stereotype.Component;

@Component
public class UserServiceMapperImpl implements UserServiceMapper {

	@Override
	public GetUserQuery from(GetUserCommand command) {
		return GetUserQuery.of(command.getId());
	}

	@Override
	public SetUserQuery from(SetUserCommand command) {
		return SetUserQuery.of(command.getId(), command.getName());
	}

	@Override
	public UserReply from(UserResult result) {
		return UserReply.of(result.getId(), result.getName());
	}
}
