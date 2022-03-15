package com.sokha.demo.springdataredis.infrastructure.cache.repository;

import com.sokha.demo.springdataredis.infrastructure.cache.entity.UserCache;
import java.time.Duration;
import java.util.Map;
import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserHashOpsRepository {

	private HashOperations<String, Integer, UserCache> hashOperations;
	private final RedisTemplate<String, Object> redisTemplate;
	private final String USER_KEY = "USER";

	@PostConstruct
	void setup() {
		this.hashOperations = redisTemplate.opsForHash();
	}


	public void set(UserCache user) {
		this.hashOperations.put(this.USER_KEY, user.getId(), user);
		redisTemplate.expire(USER_KEY, Duration.ofSeconds(5));
	}


	public UserCache get(Integer id) {
		return this.hashOperations.get(this.USER_KEY, id);
	}


	public Map<Integer, UserCache> getAll() {
		return this.hashOperations.entries(this.USER_KEY);
	}

	public void delete(Integer id) {
		this.hashOperations.delete(this.USER_KEY, id);
	}


}
