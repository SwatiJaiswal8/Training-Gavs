package java1;

import java.util.Comparator;

public class StudentComapre implements Comparator<StudentDemo>{
	public int compare(StudentDemo name1, StudentDemo name2) {
		return name1.getName().compareTo(name2.getName());
	}

	
}
