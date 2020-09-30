package com.luban.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class LoggerMethodBeforeAdvice implements MethodBeforeAdvice {

	// 方法执行前进行调用，前置增强
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName());
		System.out.println("方法执行之前");
	}
}
