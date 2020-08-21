package com.luban.beandefinition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MergedBeanDefinitionDemo {

	/**
	 *  GenericBeanDefinition: 通用型BeanDefinition
	 *  RootBeanDefinition: 无Parent的BeanDefinition(解释了为什么叫Root) 或者 合并后的BeanDefinition
	 *  AnnotatedBeanDefinition: 注解标注的BeanDefinition
	 *
	 * @param args
	 */

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		GenericBeanDefinition parentBeanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder.genericBeanDefinition(User.class).getBeanDefinition();
		parentBeanDefinition.setScope("prototype");

		GenericBeanDefinition childBeanDefinition = (GenericBeanDefinition) BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
		childBeanDefinition.setParentName("user");

		context.registerBeanDefinition("user", parentBeanDefinition);
		context.registerBeanDefinition("child", childBeanDefinition);

		RootBeanDefinition mergedBeanDefinition = (RootBeanDefinition) context.getDefaultListableBeanFactory().getMergedBeanDefinition("user");
		context.registerBeanDefinition("merged", mergedBeanDefinition);


		context.refresh();


		System.out.println(context.getBean("child"));
		System.out.println(context.getBean("child"));
		System.out.println(context.getBean("child"));

	}
}
