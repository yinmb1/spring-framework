package com.luban.aop;

import com.luban.aop.service.LubanService;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

public class ProxyFactoryTest {

	public static void main(String[] args) {
		LubanService lubanService = new LubanService(); //原始对象

		ProxyFactory proxyFactory = new ProxyFactory();

		proxyFactory.setTarget(lubanService); // 原始对象

		proxyFactory.addAdvice(new MethodBeforeAdvice() {
			@Override
			public void before(Method method, Object[] args, Object target) throws Throwable {
				// method表示当前执行的方法,args表示执行方法的参数,target表示target对象

				System.out.println("执行目标方法调用之前的逻辑");


			}
		});


		LubanService proxy = (LubanService) proxyFactory.getProxy(); // 代理对象

		proxy.test();  // 代理对象（另外一个）
	}
}
