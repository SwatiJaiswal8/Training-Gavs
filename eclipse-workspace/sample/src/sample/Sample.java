package sample;
import java.util.*;
public class Sample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String str =sc.nextLine();
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.indexOf('l'));
		System.out.println(str.lastIndexOf('o'));
		System.out.println(str.substring(2));
		System.out.println(str.concat("world"));
		System.out.println(str);
		System.out.println(str.replace('l', 'a'));
		str=" He llo world";
		System.out.println(str.length());
		str=str.trim();
		System.out.println(str.length());
		System.out.println(str.contains("ll"));
		char ch[] =str.toCharArray();
		for(char c :ch) {
			System.out.println(c);
		}

	}

}
