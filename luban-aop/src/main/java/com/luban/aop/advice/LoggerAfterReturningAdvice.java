package com.luban.aop.advice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LoggerAfterReturningAdvice implements AfterReturningAdvice {

	// 方法执行后进行调用，后置增强  --->建议
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

	}
}
