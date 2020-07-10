package com.luban.service;

import com.luban.entity.A;
import com.luban.entity.B;
import com.luban.entity.C;
import com.luban.entity.D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.ConstructorProperties;


@Component
public class AService {

	private A a;
	private B b;
	private C c;
	private D d;

	@Autowired(required = false)
	public AService(B b) {
		System.out.println("只有B的构造方法");
		this.b = b;
	}

	@Autowired(required = false)
	public AService(A a) {
		System.out.println("只有A的构造方法");
		this.a = a;
	}

	@Autowired(required = false)
	@ConstructorProperties({"a1", "b1"})
	public AService(A a, B b) {
		System.out.println("有A，B的构造方法");
		this.a = a;
	}
}
