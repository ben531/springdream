package aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Service;

@Service
public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.print(target.getClass().getName() +"."+ method.getName() + "() begin, 鍏ュ弬涓�:");
		for (Object object : args) {
			System.out.print(object + " ");
		}
	}
}
