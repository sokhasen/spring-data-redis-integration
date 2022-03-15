package com.sokha.demo.springdataredis.core.model.reply;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class UserReply {

	private Integer id;
	private String name;
}
