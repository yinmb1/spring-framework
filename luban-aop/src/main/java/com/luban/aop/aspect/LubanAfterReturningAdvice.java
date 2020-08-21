package com.luban.aop.aspect;

import com.luban.aop.service.User;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class LubanAfterReturningAdvice implements AfterReturningAdvice {
	//

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("返回结果" + returnValue);

		((User)returnValue).setName("yyy");
	}
}
