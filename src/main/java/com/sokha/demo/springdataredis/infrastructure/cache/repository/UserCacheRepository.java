package com.sokha.demo.springdataredis.infrastructure.cache.repository;

import com.sokha.demo.springdataredis.infrastructure.cache.entity.UserCache;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCacheRepository extends CrudRepository<UserCache, Integer> {

}
