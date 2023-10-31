package stream1;

import java.util.ArrayList;
import java.util.List;

public class RemoveDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(44);
		li.add(21);
		li.add(44);
		li.add(34);
		li.add(21);
		li.add(2);
		li.add(5);
		li.add(12);
		List list =li.stream().distinct().toList();
		System.out.println(list);

	}

}
