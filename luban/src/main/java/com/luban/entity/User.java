package com.luban.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public class User implements Person {
	private int i;

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}
}
