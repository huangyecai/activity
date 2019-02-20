package com.hyc.activity.modules.user.dao;

import org.apache.ibatis.annotations.Mapper;

import com.hyc.activity.modules.user.entity.User;

@Mapper
public interface UserDao {
	
	public User get(int id);

}
