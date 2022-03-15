package com.sokha.demo.springdataredis.core.ports.outgoing;

import com.sokha.demo.springdataredis.core.model.query.GetUserQuery;
import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;

public interface UserServiceProvider {

	/**
	 * Handling get user data
	 *
	 * @param query :
	 * @return :
	 */
	UserResult handle(GetUserQuery query);


	/**
	 * Handling set user data
	 *
	 * @param query :
	 * @return :
	 */
	void handle(SetUserQuery query);
}
