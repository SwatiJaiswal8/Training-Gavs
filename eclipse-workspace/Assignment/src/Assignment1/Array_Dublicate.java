package Assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Dublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int size = sc.nextInt();
		int array [] =new int[size];
		for(int i =0 ;i<size; i++) {
			array[i]=sc.nextInt();
		}
		Arrays.sort(array);
        int count = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                count++;
            }
        }
        int[] newArray = new int[count];
        newArray[0] = array[0];
        int index = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                newArray[index] = array[i];
                index++;
            }
        }
        for(int a: newArray) {
        	System.out.println(a);
        }
    }

 






		
	}


