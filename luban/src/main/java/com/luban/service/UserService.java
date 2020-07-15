package com.luban.service;

import com.luban.entity.A;
import com.luban.entity.B;
import com.luban.entity.C;
import com.luban.entity.D;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserService {

	private A a;
	private B b;
	private C c;
	private D d;

//	@Autowired(required = false)
	public UserService(B b) {
		System.out.println("只有B的构造方法");
		this.b = b;
	}

//	@Autowired(required = false)
	public UserService(A a) {
		System.out.println("只有A的构造方法");
		this.a = a;
	}

//	@Autowired(required = false)
//	public UserService(A a1, B b1) {
//		System.out.println("有A，B的构造方法");
//		this.a = a1;
//	}
//
//	@Autowired(required = false)
//	public UserService(A a1, C c1) {
//		System.out.println("有A，C的构造方法");
//	}
}
