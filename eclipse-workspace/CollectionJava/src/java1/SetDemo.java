package java1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> mySet = new HashSet<>();
		//Set<Integer> mySet = new TreeSet<>();
		mySet.add(4);
		mySet.add(5);
		mySet.add(11);
		mySet.add(9);
		mySet.add(3);
		mySet.add(4);
		System.out.println(mySet.size());
		mySet.add(1);
		mySet.add(null);
		System.out.println(mySet.contains(5));
		/*Iterator<Integer> it = mySet.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}*/
		for(Integer i : mySet) {
			System.out.println(i);
		}
		

	}

}
