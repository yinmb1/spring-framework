package com.luban;

import com.luban.entity.*;
import com.luban.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.MethodInvoker;

public class Test {

	public static void main(String[] args) {
//		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
////		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//
//		UserService userService = applicationContext.getBean("userService", UserService.class);

//		System.out.println(userService.getUser());


		Object[] objects = new Object[]{new A()};

		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{A.class}, objects));
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{B.class}, objects));
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{C.class}, objects));
		System.out.println(MethodInvoker.getTypeDifferenceWeight(new Class[]{D.class}, objects));
	}
}
