package java1;
import java.util.ArrayList;
import java.util.Iterator;
class ArrayListDemo {
	private ArrayList<String> names;
	public ArrayListDemo () {
		this.names =new ArrayList<>();
	}
	public void setName(String name) {
        names.add(name);
    }
	public void searchName(String name) {
		if(names.contains(name)) {
			System.out.println("name is found");
		}
		else {
			System.out.println("name is not found");
		}
	}
		public void searchName(int index){
			if(index>=0 && index<names.size()) {
				String name = names.get(index);
				System.out.println("name is found at "+index + " name is: " +name);
			}
			else {
				System.out.println("invalid index ");
			}
		}
		public void printNames() {
			Iterator it = names.iterator();
			while(it.hasNext()) {
				System.out.println("names : "+ it.next());
			}
		
		}
		public void removeName(String name) {
			if(names.contains(name)) {
				names.remove(name);
				System.out.println("1 element is removed ");
				
			}
		}

	
}
public class Student{
	public static void main(String arg[]) {
	ArrayListDemo ald = new ArrayListDemo ();
	ald.setName("swati");
	ald.setName("jyothi");
	ald.setName("Bhargav");
	ald.setName("Ravi");
	ald.setName("Teja");
	ald.searchName("jyothi");
	ald.searchName(2);
	ald.printNames();
	ald.removeName("teja");
	ald.printNames();
	}
}
