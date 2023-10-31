package java1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List myList = new ArrayList();
		myList.add(2);
		myList.add("Hello");
		myList.add(new Date());
		System.out.println(myList);
		myList.add(2,"Welcome");
		System.out.println(myList);
		System.out.println(myList.indexOf("Welcome"));
		System.out.println(myList.contains("Hello"));
		myList.remove(1);
		System.out.println(myList);
		myList.set(1, "NewHello");
		System.out.println(myList);
		for(Object  i :myList) {
			System.out.println(i);
		}
		System.out.println("print by using iterator");
		Iterator it = myList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}
