package sample;

public class ExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a ,b,c=0;
		try {
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a/b;}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array not found");
			//ex.printStackTrace();
			
		}
		catch(ArithmeticException ex){
			System.out.println("the 2nd argument is 0");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
		

	}

}
