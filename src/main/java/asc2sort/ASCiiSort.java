package asc2sort;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

public class ASCiiSort {

	private String name;
	private Integer age;
	private Date birth;
	private String address;
	private List<ASCiiSort> list;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public List<ASCiiSort> getList() {
		return list;
	}
	public void setList(List<ASCiiSort> list) {
		this.list = list;
	}
	
	
	public static String sha256(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(str.getBytes());

			byte[] b = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				int v = (int) b[i];
				v = v < 0 ? 0x100 + v : v;
				String cc = Integer.toHexString(v);
				if (cc.length() == 1){
					sb.append('0');
				}
				sb.append(cc);
			}

			return sb.toString();
		} catch (Exception e) {
		}
		return "";
	}
	public static void main(String[] args) {
		String salt="fujintongjuxin123!@%^&&&**((((&^%%$$";
		List<ASCiiSort> list=new ArrayList<ASCiiSort>();
		ASCiiSort  pp = new ASCiiSort();
		ASCiiSort p2= new ASCiiSort();
		ASCiiSort p3= new ASCiiSort();
		pp.setName("lisi");
		pp.setAddress("asdfas");
		pp.setAge(11);
		list.add(pp);
		
		p2.setAddress("asdf");
		p2.setAge(12);
		list.add(p2);
		
		p3.setAddress("sdf");
		p3.setAge(44);
		list.add(p3);
		System.out.println(JSONObject.toJSONString(list));
		
		
		ASCiiSort  p = new ASCiiSort();
		p.setAge(12);
//		p.setBirth(new Date());
		p.setName("zhangsan");
		p.setAddress("sz");
		p.setList(list);
		
		String jsonString = JSONObject.toJSONString(p);
		System.out.println(jsonString);
		
		System.out.println(jsonString+salt);
		String sign = sha256(jsonString+salt);
		
		System.out.println(sign);
		
		
		
	}
}
