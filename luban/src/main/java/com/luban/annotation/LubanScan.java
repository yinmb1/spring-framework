package com.luban.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface LubanScan {

	String value() default "";
}
