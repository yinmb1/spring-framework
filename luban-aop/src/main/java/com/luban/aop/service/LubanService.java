package com.luban.aop.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

@Component
public class LubanService {

	public User test() {
		System.out.println("===");
		return new User("xxx");
	}
}
