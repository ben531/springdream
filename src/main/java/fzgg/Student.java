package fzgg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private String name;
	@Autowired
	private StsInfo info;
	

	public StsInfo getInfo() {
		return info;
	}

	public void setInfo(StsInfo info) {
		this.info = info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String eat(){
		return name + "在吃";
	}
	
	public String getSchool(){
		return info.getSchool();
	}
}
