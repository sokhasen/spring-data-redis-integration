package com.sokha.demo.springdataredis.application.adapter.web;

import com.sokha.demo.springdataredis.application.mapper.UserWebMapper;
import com.sokha.demo.springdataredis.application.model.request.UserRequest;
import com.sokha.demo.springdataredis.application.model.response.UserResponse;
import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;
import com.sokha.demo.springdataredis.core.ports.incoming.UserService;
import java.net.URI;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("users")
public class UserWebAdapter implements UserRest {

	private final UserService userService;
	private final UserWebMapper userWebMapper;


	@Override
	public ResponseEntity<UserResponse> getOneUser(Integer id) {
		GetUserCommand command = userWebMapper.from(id);
		UserReply user = userService.handle(command);
		UserResponse response = userWebMapper.from(user);
		return ResponseEntity.ok(response);
	}

	@Override
	public ResponseEntity<URI> setOneUser(UserRequest request) {
		SetUserCommand command = userWebMapper.from(request);
		userService.handle(command);
		return ResponseEntity.created(URI.create("/users/:id")).build();
	}
}
