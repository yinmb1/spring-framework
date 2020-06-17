package com.luban;

import com.luban.service.AService;
import com.luban.service.BService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		BService aService = context.getBean("BService", BService.class);
		aService.test();
	}
}
