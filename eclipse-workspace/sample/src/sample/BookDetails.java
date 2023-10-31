package sample;

import java.util.Scanner;

 

public class BookDetails {
	public static void main(String[] args) {

		Book myBook=new Book();
		Book obj =new Book(100,"java adv","Mike",4560.0f);
		System.out.println(obj.toString());
 

		Scanner sc=new Scanner(System.in);

 

		System.out.println("enter number:");

		

		myBook.setBookNo(sc.nextInt());

 

		sc.nextLine();

 

		System.out.println("enter Title:");

 

		myBook.setTitle(sc.nextLine());

 

		System.out.println("enter Author :");

 

		myBook.setAuthor(sc.nextLine());

 

		System.out.println("enter Price:");

 

		myBook.setPrice(sc.nextFloat());

 

		System.out.println(myBook.getBookNo()+" "+myBook.getTitle()+" "+myBook.getAuthor()+" "+myBook.getPrice());
		Book[] books = new Book[3];
		int bookNumber;
		String bookTitle, bookAuthor;
		float  bookPrice;
		for(int i=0;i<3;i++) {
			System.out.println("Book no:");
			bookNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("Book title:");
			bookTitle=sc.nextLine();
			System.out.println("Book Author:");
			bookAuthor=sc.nextLine();
			
			System.out.println("Book price:");
			bookPrice=sc.nextFloat();
			books[i]=new Book(bookNumber, bookTitle, bookAuthor, bookPrice);
		}
		for(Book book :books) {
			System.out.println(book);
			
		}

		System.out.println("no of books "+Book.getBookCount());

 

 

	}

 

 

 

}

 

 

 
