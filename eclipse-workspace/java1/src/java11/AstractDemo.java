package java11;
class Circle extends Shape implements Printable{
	PrimeNumber pn = new PrimeNumber();
	public Circle() {
		
		System.out.print("circle created");
	}
	public Circle(String s) {
		super(s);
		System.out.print("circle paara created");
	}
	public void draw() {
		System.out.println("Draw the circle");
	}
	public int area(int r ) {
		return (r * r);
	}
	public void print() {
		System.out.println("Cicle print");
	}
}
class Reactangle extends Shape implements Printable{
	Reactangle(){
		//super();
		System.out.println("react cons");
	}
	public void draw() {
		System.out.println("draw reactangle");
	}
	public int area(int length ,int breadth) {
		return length * breadth;
	}
	public void print() {
		System.out.println("reactangle print");
	}
}
public class AstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Circle c = new Circle("red");
		c.draw();
		Reactangle r = new Reactangle("sds");
		int z=r.area(10, 15);
		System.out.println(z);*/
		//Shape[] shapes = new Shape[6];
		
		Printable[] shapes = new Printable[6];
		shapes[0]= new Circle();
		shapes[1]= new Reactangle();
		shapes[2]= new Circle();
		shapes[3]= new Reactangle();
	//	shapes[3]= new Circle();
		for(Printable s :shapes) {
			s.print();
		}
		

	}

}
