package fzggtest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fzgg.Student;

public class StudentTest {
	
	@SuppressWarnings("resource")
	@Test
	public void eatTest() throws Exception{
		ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext-springmvc.xml");
		Student st= (Student) ac.getBean("student");
		System.out.println(st.eat());
		System.out.println(st.getSchool());
	}
}
