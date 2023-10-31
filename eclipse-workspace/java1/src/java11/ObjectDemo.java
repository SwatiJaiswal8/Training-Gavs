package java11;
class Box{
	private int size;
		public Box() {
		size=0;
	}
	public Box(int size) {
		this.size=size;
	}
	public String toString(){
		return "size of box"+ size;
		
	}
	public boolean equals(Box b) {
		if(this.size==b.size) return true;
		return false;
	}
	public int hashCode() {
		
		return size;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1= new Box(1);
		Box b2 = new Box(2);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		if(b1.equals(b2)) {
			System.out.println("equals");
		}
		

	}

}
