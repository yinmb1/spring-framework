package com.luban.aop;

import com.luban.aop.advice.LoggerMethodBeforeAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan("com.luban.aop")
@EnableAspectJAutoProxy
public class AppConfig {



	@Bean
	public NameMatchMethodPointcutAdvisor advisor(){
		NameMatchMethodPointcutAdvisor nameMatchMethodPointcutAdvisor = new NameMatchMethodPointcutAdvisor();
		nameMatchMethodPointcutAdvisor.addMethodName("test");

		nameMatchMethodPointcutAdvisor.setAdvice(new LoggerMethodBeforeAdvice());

		return nameMatchMethodPointcutAdvisor;
	}
}
