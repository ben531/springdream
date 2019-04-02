package aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop2/applicationContext-springmvc.xml");
		TestServiceImpl ts =(TestServiceImpl) ac.getBean("testServiceImpl");
		ts.add("asf");
	}
}
