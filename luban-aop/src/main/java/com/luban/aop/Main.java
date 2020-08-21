package com.luban.aop;

import com.luban.aop.aspect.LubanAfterReturningAdvice;
import com.luban.aop.service.LubanInterface;
import com.luban.aop.service.LubanService;
import com.luban.aop.service.User;
import org.springframework.aop.framework.ProxyFactory;

public class Main {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.addAdvice(new LubanAfterReturningAdvice());

//		proxyFactory.setTarget(new LubanService());
//		LubanService proxy = (LubanService) proxyFactory.getProxy();

		proxyFactory.setTargetClass(LubanInterface.class);
		LubanInterface proxy = (LubanInterface) proxyFactory.getProxy();

		User user = proxy.test();
		System.out.println(user.getName());


	}
}
