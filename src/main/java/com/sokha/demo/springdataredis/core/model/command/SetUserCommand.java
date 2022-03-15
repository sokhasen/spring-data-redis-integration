package com.sokha.demo.springdataredis.core.model.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class SetUserCommand {

	private Integer id;
	private String name;
}
