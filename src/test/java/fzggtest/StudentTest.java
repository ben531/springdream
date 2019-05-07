package fzggtest;

import java.util.HashSet;
import java.util.Optional;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import fzgg.A;
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
	
	
	@Test
	public void test3() {
		HashSet<String> set = new HashSet<String>();
		boolean add = set.add("w");
		boolean add2 = set.add("w");
		System.out.println(set);
	}
	@Test
	public void test4() {
		HashSet<StringBuilder> set = new HashSet<StringBuilder>();
		
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder("ab");
		set.add(sb1);
		set.add(sb2);
		System.out.println(set);
		
		StringBuilder sb3 = sb1;
		sb3.append("b");
		System.out.println(set);
	}
	
	@Test
	public void test5() {
		switch ("w") {
		case "w":
			System.out.println("w");
			break;

		default:
			System.out.println("o");
			break;
		}
	}
	
	@Test
	public void test6() throws CloneNotSupportedException {
//		String a = "a";
//		String b = new String("a");
//		System.out.println(a==b);
		A a1 = new A();
		a1.setA("a");
		a1.setB("b");
		
		A a2 = new A();
		
		a2=(A)a1.clone();
		System.out.println(a2);
	}
}
