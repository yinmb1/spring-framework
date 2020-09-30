package com.luban.transaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//		applicationContext.getBean("transactionTemplateService", TransactionTemplateService.class).test();
//		applicationContext.getBean("transactionManagerService", TransactionManagerService.class).test();
		applicationContext.getBean("transactionAnnotationService", TransactionAnnotationService.class).test();

	}
}
