package com.luban.test;

import com.luban.bean.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

public class DataBinderTest {

	public static void main(String[] args) {
		User user = new User();
		DataBinder binder = new DataBinder(user);
		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.add("name", "luban");

		binder.bind(pvs);

		System.out.println(user.getId());
		System.out.println(user.getName());
	}
}
