package com.luban.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {
	@Override
	public void setBeanName(String name) {
		System.out.println("BeanNameAware:"+ name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactory:"+ beanFactory);
	}

	// postProcessBeforeInitialization

	@PostConstruct
	public void postConstruct() {
		System.out.println("PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

	// postProcessAfterInitialization

	@PreDestroy
	public void preDestroy() {
		System.out.println("PreDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean");
	}
}
