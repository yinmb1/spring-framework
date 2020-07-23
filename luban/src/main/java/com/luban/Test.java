package com.luban;

import com.luban.processor.LubanBeanFactoryPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();

//		context.addBeanFactoryPostProcessor(new LubanBeanFactoryPostProcessor());

		context.register(AppConfig.class);

		context.refresh();

		System.out.println(context.getBean("userService"));

	}
}
