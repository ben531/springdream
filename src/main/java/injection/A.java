package injection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class A {
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private Properties myPro;
	
	public void setMyPro(Properties myPro) {
		this.myPro = myPro;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<String, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<String, String> myMap) {
		this.myMap = myMap;
	}
	@Override
	public String toString() {
		return "A [myList=" + myList + ", mySet=" + mySet + ", myMap=" + myMap + ", myPro=" + myPro + "]";
	}
	
	
	
}
