package java1;



import java.util.HashSet;
import java.util.Set;

import java.util.TreeSet;

 

public class BookSetData {

 

	public static void main(String[] args) {

		Set<BookEqualSet> mySet=new HashSet<BookEqualSet>();

		mySet.add(new BookEqualSet(1,"Programming in C","Ramki",450));

		mySet.add(new BookEqualSet(2,"C Data Structures","Bala",4500));

		mySet.add(new BookEqualSet(3,"Java Programming","Ravi",3450));
		mySet.add(new BookEqualSet(1,"Programming in C","Ramki",450));

 

		for(BookEqualSet o:mySet) {

			System.out.println(o);;

		}

	}

}

 
