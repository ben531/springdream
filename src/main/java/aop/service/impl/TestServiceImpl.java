package aop.service.impl;

import org.springframework.stereotype.Service;

import aop.service.ITestService;

@Service
public class TestServiceImpl implements ITestService {

	@Override
	public void sayHi() {
		System.out.println("aop.TestServiceImpl.sayHi()");
	}

	@Override
	public String sayName(String name, String adress) {
		return name + "aop.TestServiceImpl.sayName(String, String)";
	}

}
