package aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop2.test.Test;

@SuppressWarnings("resource")
public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop2/applicationContext-springmvc.xml");
		Test bean = (Test)ac.getBean("test");
		System.out.println(bean.toString());
		bean.dosth();
		TestServiceImpl ts =(TestServiceImpl) ac.getBean("testServiceImpl");
		ts.add("asf");
	}
}
