package com.sokha.demo.springdataredis.application.mapper;

import com.sokha.demo.springdataredis.application.model.request.UserRequest;
import com.sokha.demo.springdataredis.application.model.response.UserResponse;
import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;

public interface UserWebMapper {

	GetUserCommand from(Integer id);

	UserResponse from(UserReply user);

	SetUserCommand from(UserRequest request);
}
