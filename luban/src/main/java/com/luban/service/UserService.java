package com.luban.service;

import com.luban.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private User user;

	public void test() {
		System.out.println(user);
	}


}
