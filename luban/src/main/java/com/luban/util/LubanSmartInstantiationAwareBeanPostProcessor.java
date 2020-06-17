package com.luban.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.SmartInstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

public class LubanSmartInstantiationAwareBeanPostProcessor implements SmartInstantiationAwareBeanPostProcessor {

	@Override
	public Object getEarlyBeanReference(Object bean, String beanName) throws BeansException {
		System.out.println(beanName);
		ProxyFactory factory = new ProxyFactory();
		factory.setTarget(bean);
		factory.addAdvice(new MethodInterceptor() {
			@Override
			public Object invoke(MethodInvocation invocation) throws Throwable {
				System.out.println("spring aop");
				return invocation.proceed();
			}
		});
		return factory.getProxy();
	}
}
