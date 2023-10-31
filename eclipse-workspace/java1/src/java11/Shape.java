package java11;

abstract public class Shape {
	public Shape() {
		System.out.println("shape");
	}
	public Shape(String d) {
		
		System.out.println("shape para");
	}

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	/*public void draw() {
		System.out.println("shape circle");
	}*/
	abstract public void draw() ;

}
