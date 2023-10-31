package java1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> product = new TreeSet<String>();
		product.add("laptop");
		product.add("Mobile");
		product.add("Ear phone");
		product.add("laptop");
		product.add("Charger");
		Iterator<String> it = product.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("------------------------");
		System.out.println(product.pollFirst());
		System.out.println("------------------------");
		System.out.println(product.pollLast());
		System.out.println("------------------------");
		System.out.println("size of treemap : " + product.size());
		System.out.println(product.remove("Ear phone"));
		System.out.println("------------------------");
		System.out.println("size of treemap : " + product.size());
		
	}

}
