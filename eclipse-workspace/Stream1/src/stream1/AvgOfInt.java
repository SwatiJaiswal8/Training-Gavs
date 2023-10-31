package stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AvgOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(4);
		li.add(3);
		li.add(9);
		li.add(10);
		int sum = li.stream().reduce((a,b)->a+b).get();
		int n= li.size();
		float avg1 = sum/n;
		System.out.println(avg1);
		System.out.println("----------------");
		double avg = li.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println(avg);
		

	}

}
