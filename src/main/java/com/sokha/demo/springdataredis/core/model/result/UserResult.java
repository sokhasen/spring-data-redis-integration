package com.sokha.demo.springdataredis.core.model.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class UserResult {

	private Integer id;
	private String name;
}
