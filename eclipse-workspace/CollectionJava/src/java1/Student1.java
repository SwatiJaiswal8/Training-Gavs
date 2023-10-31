package java1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class TestHashMap {
	private HashMap<String ,String> empNames;
	TestHashMap(){
		this.empNames = new HashMap<String,String >();
	}
	public void setName(String key,String value) {
		empNames.put(key, value);
	}
	public void printNames() {
		Set<String> keys = empNames.keySet();
		for(String key1 :keys) {
			String name =empNames.get(key1);
			System.out.println("key " + key1 + "values " + name );
		}
	}
	public void getName(String keyy) {
		String name = empNames.get(keyy);
		if(empNames.containsValue(name)) {
			System.out.println("Value :" +name);
		}
		else {
			System.out.println("this name is not avaiable in empNames");
		}
		
		
	}
	public void printNameKeySet() {
		HashSet<String> keySet = new HashSet<>(empNames.keySet());
		for(String key:keySet) {
			String value = empNames.get(key);
			System.out.println("key : "+ key + " value : "+value );
		}
		
	}
	public void printSize() {
		System.out.println(empNames.size());
	}
	public void remove(String key) {
		if(empNames.containsKey(key)) {
			empNames.remove(key);
		}
	}
}
public class Student1{
	public static void main(String arg[]) {
		TestHashMap obj = new TestHashMap();
		obj.setName("1","swati");
		obj.setName("2","jyothi");
		obj.setName("3","Bhargav");
		obj.setName("4","Teja");
		obj.setName("5","Ravi");
		obj.printNames();
		obj.getName("3");
		obj.printNameKeySet();
		obj.printSize();
		obj.remove("2");
		obj.printNameKeySet();
	}
	
}