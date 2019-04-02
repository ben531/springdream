package fzggtest;

import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import fzgg.Student;
import fzgg.SyncClzz;

@Component
public class StudentTest {
	
//	@Autowired
//	@Qualifier("threadPoolExecutor")
	@XmlElement(name="threadPoolExecutor")
	private ThreadPoolExecutor es;
	
	@SuppressWarnings("resource")
	@Test
	public void eatTest() throws Exception{
		ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext-springmvc.xml");
		Student st= (Student) ac.getBean("student");
		st.setName("ss");
		System.out.println(st.eat());
		System.out.println(st.getInfo().getSchool());
//		System.out.println(st.getSchool());
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
	
	@SuppressWarnings({ "resource", "unused" })
	@Test
	public void threadPoolExecutorTest(){
		ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:applicationContext-springmvc.xml");
//		ExecutorService es = (ThreadPoolExecutor)ac.getBean("threadPoolExecutor");
		es.execute(()->{
			new SyncClzz().test();
		});
		
		for (int i = 0; i < 100; i++) {
			System.out.println("这是测试"+i);
		}
	
	}
	
	
	@Test
	public void optionalTest(){
		
		Student s = new Student();
		s.setName("sfa");
//		s = null;
		Optional<Student> test= Optional.ofNullable(s);
		
//		test.flatMap(Student::getName);
		Optional<String> map = test.map(Student::getName);
		System.out.println(map.get());
	}
}
