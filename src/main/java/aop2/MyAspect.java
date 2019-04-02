package aop2;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	@Pointcut(value="execution(* aop2..*.*(..))")
	public void mycut(){
		
	}
	
	@Before(value="mycut()")
	public void doBefore(JoinPoint jp){
		Signature signature = jp.getSignature();
		List<Object> asList = Arrays.asList(jp.getArgs());
		System.out.println(signature+" begin, ²ÎÊýÊÇ:"+ asList);
	}
	
}
