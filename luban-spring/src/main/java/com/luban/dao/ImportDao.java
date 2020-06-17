package com.luban.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ImportDao implements EnvironmentAware {


	Environment environment;

	@Value("${url}")
	private String url;


	@Override
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

	public void test() {
		System.out.println(url);
		System.out.println(environment);
		System.out.println(environment.getProperty("url"));
	}
}
