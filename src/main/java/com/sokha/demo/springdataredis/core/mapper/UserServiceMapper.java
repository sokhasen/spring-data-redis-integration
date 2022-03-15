package com.sokha.demo.springdataredis.core.mapper;


import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;
import com.sokha.demo.springdataredis.core.model.result.UserResult;

public interface UserServiceMapper {


	GetUserQuery from(GetUserCommand command);

	SetUserQuery from(SetUserCommand command);

	UserReply from(UserResult result);
}
