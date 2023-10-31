package java1;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<BookEqualSet> myBook = new ArrayDeque<BookEqualSet>();
		myBook.add(new BookEqualSet(1,"Programming in C","Ramki",450));

		myBook.add(new BookEqualSet(2,"C Data Structures","Bala",4500));

		
		for(BookEqualSet b:myBook) {
			System.out.println(b);
			
		}
		System.out.println("---------------------");
		myBook.offerFirst(new BookEqualSet(3,"Java Programming","Ravi",3450));
		myBook.offerLast(new BookEqualSet(4,"python Programming","Ravi",6550));
		for(BookEqualSet b:myBook) {
			System.out.println(b);
			
		}
		System.out.println("---------------------");
		System.out.println(myBook.pollFirst());
		System.out.println("---------------------");
		for(BookEqualSet b:myBook) {
			System.out.println(b);
			
		}
	}

}
