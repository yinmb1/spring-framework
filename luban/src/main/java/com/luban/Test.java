package com.luban;

import com.luban.service.F;
import com.luban.service.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);


		System.out.println(context.getBean(F.class));

	}
}
