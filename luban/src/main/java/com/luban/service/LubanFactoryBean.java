package com.luban.service;

import org.springframework.beans.factory.SmartFactoryBean;

public class LubanFactoryBean implements SmartFactoryBean {

	@Override
	public Object getObject() throws Exception {
		return null;
	}

	@Override
	public Class<?> getObjectType() {
		return null;
	}

	@Override
	public boolean isEagerInit() {
		return true;
	}
}
