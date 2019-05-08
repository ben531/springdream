package injection;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
	private ApplicationContext ac;

	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("classpath:injection/applicationContext-springmvc.xml");
	}

	@Test
	public void test1() {
		A a = (A)ac.getBean("a");
		System.out.println(a);
	}
	
//	public static void main(String[] args) {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:injection/applicationContext-springmvc.xml");
//		A a = (A)ac.getBean("a");
//		System.out.println(a);
//	}
}
