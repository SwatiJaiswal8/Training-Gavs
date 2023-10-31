package java1;

import java.util.Set;

import java.util.TreeSet;

 

public class BookSet {

 

	public static void main(String[] args) {

		Set<BookData> mySet=new TreeSet<BookData>(new BookCompareTitle());

		mySet.add(new BookData(1,"Programming in C","Ramki",450));

		mySet.add(new BookData(2,"C Data Structures","Bala",4500));

		mySet.add(new BookData(3,"Java Programming","Ravi",3450));

 

		for(BookData o:mySet) {

			System.out.println(o);;

		}

	}

}

 