package fzgg;

import java.util.Date;

import javax.validation.constraints.Future;

import org.springframework.stereotype.Component;

@Component
public class StsInfo {
	private String school;
	@Future(message = "必须是未来的时间点")
	private Date fDate;

	public Date getfDate() {
		return fDate;
	}

	public void setfDate(Date fDate) {
		this.fDate = fDate;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public static void main(String[] args) {
		StsInfo ss = new StsInfo();
		ss.setfDate(new Date());
		System.out.println(ss);
	}
}
