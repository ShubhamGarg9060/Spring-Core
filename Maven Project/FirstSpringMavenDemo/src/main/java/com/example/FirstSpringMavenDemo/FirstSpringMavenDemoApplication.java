package com.example.FirstSpringMavenDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FirstSpringMavenDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringMavenDemoApplication.class, args);
		ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"spring.xml"});

		BeanFactory factory = context;
		//ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
//		BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//		reader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
		Alien obj = (Alien)factory.getBean("alien");
		System.out.println(obj.getAge());
		obj.code();
	}

}
