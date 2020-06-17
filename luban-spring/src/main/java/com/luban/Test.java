package com.luban;


import com.luban.dao.ImportDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {

//		AnnotationConfigApplicationContext context =
//				new AnnotationConfigApplicationContext(AppConfig.class);
//
//		context.close();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		context.getBean(ImportDao.class).test();


	}
}
