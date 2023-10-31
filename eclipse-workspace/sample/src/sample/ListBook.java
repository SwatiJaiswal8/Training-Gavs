package sample;

//package java1;
import java.util.Set;

import java.util.TreeSet;

 

public class ListBook {

 

	public static void main(String[] args) throws InvalidDataException {

		Set<Book> mySet=new TreeSet<Book>();

		mySet.add(new Book(1,"Programming in C","Ramki",450));

		mySet.add(new Book(2,"C Data Structures","Bala",4500));

		mySet.add(new Book(3,"Java Programming","Ravi",3450));

 

		for(Book o:mySet) {

			System.out.println(o);;

		}

	}

}