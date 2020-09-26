package com.luban.aop;

import com.luban.aop.advice.LoggerMethodBeforeAdvice;
import com.luban.aop.service.LubanService;
import com.luban.aop.service.User;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

public class Main {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(new LoggerMethodBeforeAdvice());
		proxyFactory.setExposeProxy(true);

		LubanService lubanService = new LubanService();
		proxyFactory.setTarget(lubanService);

		LubanService proxy = (LubanService) proxyFactory.getProxy();

		NameMatchMethodPointcut nameMatchMethodPointcut = new NameMatchMethodPointcut();
		nameMatchMethodPointcut.addMethodName("test");
		new DefaultPointcutAdvisor(nameMatchMethodPointcut, new LoggerMethodBeforeAdvice());

//		proxyFactory.setTargetClass(LubanInterface.class);
//		LubanInterface proxy = (LubanInterface) proxyFactory.getProxy();

		User user = proxy.test();

//		System.out.println(user.getName());

		// 这里拿不到代理对象，只有在方法内才能拿到
//		System.out.println(AopContext.currentProxy());

	}
}
