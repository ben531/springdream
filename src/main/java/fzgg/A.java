package fzgg;

public class A implements Cloneable{
	private String a;
	private String b;
	private String c;
	private String d;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String test1() {
		System.out.println("test1");
		return "test1";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj==null) {
			return false;
		}
		if (obj instanceof A) {
			A objA = (A) obj;
			if (objA.getA()==this.getA()) {
				return true;
			}
		}
		
		
		return super.equals(obj);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		A a1 = new A();
		a1.setA("a");
		a1.setB("b");
		
		Object clone = a1.clone();
		System.out.println(clone);
		
		
	}
	
}
