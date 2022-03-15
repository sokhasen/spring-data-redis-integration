package com.sokha.demo.springdataredis.infrastructure.configuration;

import java.time.Duration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class CacheConfiguration {

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {

		RedisStandaloneConfiguration config = new RedisStandaloneConfiguration(
			"localhost",
			6379
		);

		return new JedisConnectionFactory(config);
	}

	@Bean
	RedisTemplate<String, Object> redisTemplate() {
		RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());
		return template;
	}
}
