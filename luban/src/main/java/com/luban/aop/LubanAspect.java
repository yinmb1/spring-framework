package com.luban.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

import java.sql.Connection;
//
@Aspect
@Component
public class LubanAspect {

	// 申明父类 AService的父类为SuperMan，所以产生的AService的代理对象就拥有了SuperMan中的方法
	@DeclareParents(value = "com.luban.service.AService", defaultImpl = SuperMan.class)
	private Man xxx;

	@Around("execution(* com.luban.service.UserService.test())")
	public String invoke(ProceedingJoinPoint point) {

		try {
			System.out.println("aop");
			return (String) point.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}

		return null;

	}
}
