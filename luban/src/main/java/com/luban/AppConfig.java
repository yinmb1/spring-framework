package com.luban;


import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.luban")
public class AppConfig {


	//	@Bean
//	public MessageSource messageSource() {
//		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
//		messageSource.setBasename("messages");
//		return messageSource;
//	}
//
//	@Bean
//	public ApplicationListener applicationListener() {
//		return new ApplicationListener() {
//			@Override
//			public void onApplicationEvent(ApplicationEvent event) {
//				if (event instanceof PayloadApplicationEvent) {
//					System.out.println(((PayloadApplicationEvent) event).getPayload());
//				}
//
//				System.out.println("接收到了一个事件"+event);
//			}
//		};
//	}

//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//
//		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
//
//		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
//
//		customEditorConfigurer.setCustomEditors(propertyEditorMap);
//
//		return customEditorConfigurer;
//	}

//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
//
//		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//
//		return conversionServiceFactoryBean;
//	}


//	@Bean
//	public ConversionServiceFactoryBean conversionService() {
//		ConversionServiceFactoryBean conversionServiceFactoryBean = new ConversionServiceFactoryBean();
//		conversionServiceFactoryBean.setConverters(Collections.singleton(new StringToUserConverter()));
//
//		return conversionServiceFactoryBean;
//	}

//	@Bean
//	public CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer customEditorConfigurer = new CustomEditorConfigurer();
//		Map<Class<?>, Class<? extends PropertyEditor>> propertyEditorMap = new HashMap<>();
//		propertyEditorMap.put(User.class, StringToUserPropertyEditor.class);
//		customEditorConfigurer.setCustomEditors(propertyEditorMap);
//		return customEditorConfigurer;
//	}


	//
//	@Bean
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setUrl("jdbc:mysql://192.168.99.100:33306/luban");
//		dataSource.setUsername("root");
//		dataSource.setPassword("123456");


//		try {
//			Connection connection = dataSource.getConnection();
//			PreparedStatement insert = connection.prepareStatement("insert");
//			insert.execute();
//			connection.commit();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}

//		return dataSource;
//	}

//	@Bean
//	public PlatformTransactionManager transactionManager() {
//		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
//		transactionManager.setDataSource(dataSource());
//
//		return transactionManager;
//	}
//
//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactory() {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource());
//		try {
//			sessionFactoryBean.setConfigurationProperties(PropertiesLoaderUtils.loadAllProperties("db.properties"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return sessionFactoryBean;
//	}


//	@Bean
//	public MyAspect myAspect() {
//		return new MyAspect();
//	}


//	@Bean
//	public MyAdvisor myAdvisor() {
//		return new MyAdvisor();
//	}

//	@Bean
//	public ProxyFactoryBean foo() {
//		ProxyFactoryBean proxy = new ProxyFactoryBean();
//		proxy.setTarget(userService());
//		proxy.addAdvisor(myAdvisor());
//		return proxy;
//	}

//	@Bean
//	public BeanNameAutoProxyCreator foo(){
//		BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//		beanNameAutoProxyCreator.setBeanNames("userService");
//		beanNameAutoProxyCreator.setInterceptorNames("myAdvisor");
////		beanNameAutoProxyCreator.setCustomTargetSourceCreators(new TargetSourceCreator() {
////			@Override
////			public TargetSource getTargetSource(Class<?> beanClass, String beanName) {
////
////			}
////		});
//		return beanNameAutoProxyCreator;
//	}


}
