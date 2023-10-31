package java1;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(2);
		list.add(4);
		//list.add("heelo");
		list.add(6);
		int sum =0;
		/*for(Object o :list) {
			sum += (int)o;
			
		}*/
		for(Integer o :list) {
			sum += o;
			
		}
		System.out.println(sum);
		

	}

}
