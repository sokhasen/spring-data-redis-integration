package com.sokha.demo.springdataredis.application.mapper;

import com.sokha.demo.springdataredis.application.model.request.UserRequest;
import com.sokha.demo.springdataredis.application.model.response.UserResponse;
import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;
import org.springframework.stereotype.Component;


@Component
public class UserWebMapperImpl implements UserWebMapper {

	@Override
	public GetUserCommand from(Integer id) {
		return GetUserCommand.of(id);
	}

	@Override
	public UserResponse from(UserReply user) {
		return UserResponse.of(user.getId(), user.getName());
	}
	@Override
	public SetUserCommand from(UserRequest request) {

		return SetUserCommand.of(request.getId(), request.getName());
	}
}
