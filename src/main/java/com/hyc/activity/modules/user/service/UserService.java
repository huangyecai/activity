package com.hyc.activity.modules.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hyc.activity.modules.user.dao.UserDao;
import com.hyc.activity.modules.user.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao; 
	
	public User get(int id){
        return userDao.get(id);
    }
}
