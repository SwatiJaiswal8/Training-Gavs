
package sample;
class InvalidDataException extends Exception {
    InvalidDataException(String msg) {
        super(msg);
    }
}
public class Book implements Comparable<Book> {
	private int bookNo;
	private String title;
	private String author;
	private float price ;
	private static int bookCount;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	Book(){
		
		//bookCount++;
		
	}
	Book(int bookNo, String title, String author, float price) throws InvalidDataException{
		super();
		boolean valid =true;
		if(title.length()<4) {
			valid=false;
			//System.out.println("Invalid title");
			throw new InvalidDataException("invalid data");}
		if(price<1 || price >5000) {
			valid=false;
			//System.out.println("price range between 1 to 5000");
			throw new InvalidDataException("invalid data");
		
		}
		if(!valid) {
			return;
		}
		this.bookNo=bookNo;
		this.title=title;
		this.author=author;
		this.price=price;
		bookCount++;
		
		
		
	}
	public String toString() {
		return "BOOK NO " + bookNo +" title "+ title+ " author "+ author +" price "+price;
	}
	public static int getBookCount() {
		return bookCount;
	}
	//@Override

	public int compareTo(Book o) {

		// TODO Auto-generated method stub

		return this.title.compareTo(o.title);

	}
	
}