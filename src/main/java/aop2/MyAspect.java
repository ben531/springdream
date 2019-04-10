package aop2;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

@Component
@Aspect
public class MyAspect {
	@Pointcut(value="execution(* aop2..*.*(..))")
	public void mycut(){
		
	}
	
	
	
//	@Before(value="mycut()")
//	public void doBefore(JoinPoint jp){
//		Signature signature = jp.getSignature();
//		List<Object> asList = Arrays.asList(jp.getArgs());
//		System.out.println(signature+" begin, 参数是:"+ asList);
//		
//	}
	
	
	@Around(value="mycut()")
	public Object doAround(ProceedingJoinPoint pjp, JoinPoint jp ) throws Throwable{
		Signature methodName = pjp.getSignature();
		Object[] args = pjp.getArgs();
		List<Object> asList = Arrays.asList(args);
		System.out.println(methodName + " begin,入参为: " + asList);
		Object proceed = pjp.proceed();
		System.out.println(methodName + " end");
		return proceed;
	}
	
}
