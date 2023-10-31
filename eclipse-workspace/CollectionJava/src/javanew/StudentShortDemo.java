package javanew;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	private int rollNo;
	private String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Student(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	public String toString() {
		return "["+"rollNo" +rollNo+ "name " +name+"]";
	}
	
	public int compareTo(Student student) {
		return this.name.compareTo(student.getName());
	}
	
}
public class StudentShortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> arr= new ArrayList<>();
		arr.add(new Student(21,"Swati"));
		arr.add(new Student(23,"Bhargav"));
		arr.add(new Student(22,"Jyothi"));
		arr.add(new Student(24,"Teja"));
		arr.add(new Student(25,"Ravi"));
		for(Student s :arr) {
			System.out.println(s.toString());
		}
		System.out.println("-------------------");
		Collections.sort(arr);
		System.out.println("-------------------");
		for(Student s :arr) {
			System.out.println(s.toString());
		}
	}

}
