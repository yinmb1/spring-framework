package com.luban.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LubanAspect {

	@Pointcut("execution(* com.luban.aop.service.*.*(..))") // the pointcut expression
	private void pointcut() {} // the pointcut signature

	@Before("pointcut())")  // Advice
	public void doAccessCheck() {
		System.out.println("xxx");
	}
}
