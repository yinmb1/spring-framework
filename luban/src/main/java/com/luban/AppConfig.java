package com.luban;


import com.luban.entity.A;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.luban")
public class AppConfig {


	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public A a() {
		return new A();
	}

}
