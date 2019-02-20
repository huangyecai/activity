package com.hyc.activity.modules.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hyc.activity.modules.user.entity.User;
import com.hyc.activity.modules.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("user/list")
	private void list() {
		int id = 1;
		User user = userService.get(id);
		System.out.println(user.getName());
	}
}
