package com.luban.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@ComponentScan("com.luban.aop")
@EnableAspectJAutoProxy
public class AppConfig {
}
