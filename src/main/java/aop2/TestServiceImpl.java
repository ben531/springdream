package aop2;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {
	private String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void add(String name){
		System.out.println("adds");
	}
}
