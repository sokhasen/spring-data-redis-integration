package com.sokha.demo.springdataredis.infrastructure.repository;

import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;

public interface UserBaseRepository {

	UserResult handle(GetUserQuery query);

	void handle(SetUserQuery query);
}
