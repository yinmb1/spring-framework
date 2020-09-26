package com.luban;

import com.luban.entity.User;
import com.luban.service.MyAdvisor;
import com.luban.service.UserService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Method;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");


		UserService userService = applicationContext.getBean("userService", UserService.class);
		userService.test111();

//		Advised advised = (Advised) userService;
//		System.out.println(advised.getAdvisors());
//
//		advised.addAdvice(new MethodBeforeAdvice() {
//			@Override
//			public void before(Method method, Object[] args, Object target) throws Throwable {
//				System.out.println("fffff" + method.getName());
//			}
//		});
//
//		System.out.println("=======");
//
//		userService.test();

//		Person person = new User();





	}
}
