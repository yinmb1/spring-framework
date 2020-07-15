package com.luban;

import com.luban.entity.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);  //UserService的bean

		System.out.println(context.getBean("userService", new B())); // 代理对象




	}
}
