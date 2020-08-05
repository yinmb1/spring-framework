package com.luban;

import com.luban.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);

		// Spring 创建一个对象（new UserService()） ---> 属性赋值
		UserService userService = context.getBean("userService", UserService.class);
		userService.test(null);


	}
}
