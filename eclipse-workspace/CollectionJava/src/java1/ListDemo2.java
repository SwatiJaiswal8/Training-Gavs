package java1;
import java.util.Date;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import java.util.stream.Stream;
public class ListDemo2 {
	public static void main(String[] args)  {
		List<BookEqualSet> myList=new ArrayList<BookEqualSet>();
		myList.add(new BookEqualSet(1,"Programming in C","Ramki",450));
		myList.add(new BookEqualSet(2,"C Data Structures","Bala",4500));
		myList.add(new BookEqualSet(3,"Java Programming","Ravi",3450));
		myList.add(new BookEqualSet(4,"Python Programming","Neena",3210));
		for(BookEqualSet o:myList) {
			System.out.println(o);
		}
		//List<BookEqualSet> newList=myList.stream().filter(e->e.getPrice()>3000).map(e->new BookEqualSet(e.getBookNo(),e.getTitle().toUpperCase(),e.getAuthor().toUpperCase(),e.getPrice())).toList();
		//System.out.println(newList);
		Map<Integer,String> books= myList.stream().collect(Collectors.toMap(BookEqualSet::getBookNo, BookEqualSet::getTitle));

				System.out.println(books);
	}

 

}

 