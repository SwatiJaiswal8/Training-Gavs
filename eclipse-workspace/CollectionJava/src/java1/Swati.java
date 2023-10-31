package java1;

public class Swati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int num[]= {3,21,9};
		for(int i : num) {
			System.out.println(i);
		}
		System.out.println("------------------");
		for(int i =0;i<num.length;i++) {
			num[i]=num[i]*2;
			System.out.println(num[i]);
		}
		System.out.println("------------------");
		for(int i : num) {
			System.out.println(i);
		}

	}

}
