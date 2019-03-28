package aop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aop.service.ITestService2;

@SuppressWarnings("resource")
public class AppTest {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:aop/applicationContext-springmvc.xml");
		ITestService2 ts =(ITestService2) ac.getBean("proxyFactoryBean");
//		System.out.println(ts);
		List<String> l = new ArrayList<String>(){
			private static final long serialVersionUID = 1L;

			{
				add("as");
				add("sda");
			}
		};
				
		
			
		ts.sayBye(l,123);
	}
}
