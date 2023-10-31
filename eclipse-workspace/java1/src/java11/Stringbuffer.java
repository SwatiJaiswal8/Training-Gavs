package java11;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String result ="";
		StringBuffer sb = new StringBuffer("");
		for(int i =0;i<20;i++) {
			//result =result+i+"";
			sb.append(i);
		}
		System.out.println(sb);
		sb.delete(2, 4);
		System.out.println(sb);
		sb.replace(5, 6, "hello");
		System.out.println(sb);
		sb.setCharAt(7, 'a');
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb);

	}

}
