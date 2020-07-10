package com.luban;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);  //UserService的bean

		System.out.println(context.getBean("a")); // 代理对象
		System.out.println(context.getBean("a")); // 代理对象
		System.out.println(context.getBean("a")); // 代理对象




	}
}
