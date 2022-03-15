package com.sokha.demo.springdataredis.application.adapter.web;

import com.sokha.demo.springdataredis.application.model.request.UserRequest;
import com.sokha.demo.springdataredis.application.model.response.UserResponse;
import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserRest {


	@GetMapping("{id}")
	ResponseEntity<UserResponse> getOneUser(@PathVariable Integer id);


	@PostMapping
	ResponseEntity<URI> setOneUser(@RequestBody UserRequest request);

}
