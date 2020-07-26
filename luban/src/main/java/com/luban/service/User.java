package com.luban.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
public class User {

	@Component
	public class User1 {

		public class User2 {

			@Bean
			public  F f() {
				return new F();
			}
		}
	}
}
