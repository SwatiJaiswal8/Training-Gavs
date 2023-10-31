package stream1;

import java.util.ArrayList;
import java.util.List;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<>();
		li.add("World");
		li.add("Is");
		li.add("Full");
		li.add("Of");
		li.add("Wonderful");
		li.add("Things");
		long count =li.stream().map(e->e.toUpperCase()).filter(e->e.startsWith("W")).count();
		System.out.println(count);
		
		

	}

}
