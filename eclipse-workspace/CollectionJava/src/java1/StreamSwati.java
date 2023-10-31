package java1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamSwati {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(6);
		arr.add(4);
		arr.add(8);
		Stream<Integer> st= arr.stream();
		//st.forEach(i->System.out.println(i*5));	
		int data=IntStream.of(arr).map(e->e*2).reduce((a,b)->a+b).getAsInt();
		System.out.println("------------------");
		for(int i: arr) {
			System.out.println(i);
		}
		}
	

}


