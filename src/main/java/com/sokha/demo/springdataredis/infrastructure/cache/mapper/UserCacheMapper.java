package com.sokha.demo.springdataredis.infrastructure.cache.mapper;


import com.sokha.demo.springdataredis.core.model.query.SetUserQuery;
import com.sokha.demo.springdataredis.core.model.result.UserResult;
import com.sokha.demo.springdataredis.infrastructure.cache.entity.UserCache;

public interface UserCacheMapper {

	UserResult from(UserCache cache);

	UserCache from(SetUserQuery query) ;
}
