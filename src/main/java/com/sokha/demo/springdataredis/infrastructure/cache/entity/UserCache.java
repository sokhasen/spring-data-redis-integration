package com.sokha.demo.springdataredis.infrastructure.cache.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(value = "userCache", timeToLive = 5L) //5s
@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class UserCache implements Serializable {

	private Integer id;
	private String name;
}
