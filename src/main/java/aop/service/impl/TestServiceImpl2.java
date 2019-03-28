package aop.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import aop.service.ITestService2;

@Service
public class TestServiceImpl2 implements ITestService2 {

	@Override
	public void sayBye(List<String> l,int i  ) {
		System.out.println("byebyeasdfadf");
	}

}
