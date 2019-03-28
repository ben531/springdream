package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("resource")
public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop/applicationContext-springmvc.xml");
		ITestService ts =(ITestService) ac.getBean("proxyFactoryBean");
		ts.sayName("张三", "where");
		
	}
}
