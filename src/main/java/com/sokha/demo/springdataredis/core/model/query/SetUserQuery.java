package com.sokha.demo.springdataredis.core.model.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class SetUserQuery {

	private Integer id;
	private String name;

}
