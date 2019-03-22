package fzggtest;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
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
	
	
	@Test
	public void stringBufferTest(){
		StringBuffer sb= new StringBuffer();
//		System.out.println(sb.toString());
		String string = sb.toString();
		Assert.assertNotNull(string);
		
		if (StringUtils.isBlank(string)) {
			System.out.println("kong");
		}
		
	}
	
	
}
