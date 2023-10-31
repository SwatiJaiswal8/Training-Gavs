package java11;

public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b;
		Integer bobj = new Integer(23);
		int x =bobj.intValue();
		System.out.println(x);
		System.out.println(bobj);
		b=a;
		System.out.println(a+" "+b);
		Integer cobj;
		cobj=bobj;
		System.out.println(bobj.toString()+" "+cobj.toString());
		b=Integer.parseInt("45");
	}

}
