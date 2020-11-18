package com.luban;

import com.luban.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		UserService userService = applicationContext.getBean("userService", UserService.class);//beanDefinition  单例的，原型
		System.out.println(userService);
		userService.equals(null);


	}
}
