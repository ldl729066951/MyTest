package com.castor.plugin.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringUtil implements ApplicationContextAware{

	private static ApplicationContext applicationContext = null;
	
	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		if(SpringUtil.applicationContext == null){
			SpringUtil.applicationContext = ac;
		}
		System.out.println("========ApplicationContext配置成功,在普通类可以通过调用SpringUtils.getAppContext()获取applicationContext对象,applicationContext="+SpringUtil.applicationContext+"========");
	}

	//获取applicationContext
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	
	//通过name过去bean
	public static Object getBean(String name){
		return getApplicationContext().getBean(name);
	}

	//通过class获取bean
	public static <T> T getBean(Class<T> clazz){
		return getApplicationContext().getBean(clazz);
	}
	
	//通过name,以及clazz返回指定的Bean
	public static <T> T getBean(String name, Class<T> clazz){
		return getApplicationContext().getBean(name, clazz);
	}
	
}
