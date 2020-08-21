package com.luban.service;

import com.luban.entity.Person;
import com.luban.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserService {

	private Person user;

	private Person user1;


	public UserService() {
		System.out.println("无参构造方法");
	}

	public UserService(User user) {
		System.out.println("一个参数构造方法");
		this.user = user;
	}


//	public UserService(Person user, User user1) {
//		System.out.println("两个参数构造方法(实现类)");
//		this.user = user;
//		this.user1 = user1;
//	}
//
//	public UserService(User user, Person user1) {
//		System.out.println("两个参数构造方法(接口类)");
//		this.user = user;
//		this.user1 = user1;
//	}

}
