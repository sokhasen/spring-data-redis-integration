package com.sokha.demo.springdataredis.core.ports.incoming;

import com.sokha.demo.springdataredis.core.model.command.GetUserCommand;
import com.sokha.demo.springdataredis.core.model.command.SetUserCommand;
import com.sokha.demo.springdataredis.core.model.reply.UserReply;

public interface UserService {

	/**
	 * Get user
	 *
	 * @param command :
	 * @return :
	 */
	UserReply handle(GetUserCommand command);


	/**
	 * Set user
	 *
	 * @param command :
	 * @return :
	 */
	void handle(SetUserCommand command);
}
