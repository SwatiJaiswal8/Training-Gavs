package java1;



import java.util.ArrayList;
import java.util.Collections;

class StudentDemo {
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
	
	StudentDemo(int rollNo, String name){
		this.rollNo=rollNo;
		this.name=name;
		
	}
	public String toString() {
		return "["+"rollNo " +rollNo+ " name " +name+"]";
	}
	
	
	
}
public class StudentShortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<StudentDemo> arr= new ArrayList<>();
		arr.add(new StudentDemo(21,"Swati"));
		arr.add(new StudentDemo(23,"Bhargav"));
		arr.add(new StudentDemo(22,"Jyothi"));
		arr.add(new StudentDemo(24,"Teja"));
		arr.add(new StudentDemo(25,"Ravi"));
		for(StudentDemo s :arr) {
			System.out.println(s.toString());
		}
		System.out.println("-------------------");
		Collections.sort(arr,new StudentComapre());
		System.out.println("-------------------");
		for(StudentDemo s :arr) {
			System.out.println(s.toString());
		}
	}

}

