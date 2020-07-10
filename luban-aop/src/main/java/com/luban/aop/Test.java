package com.luban.aop;

import com.luban.aop.service.LubanService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		LubanService lubanService = applicationContext.getBean("lubanService", LubanService.class);

		lubanService.test();
	}
}
