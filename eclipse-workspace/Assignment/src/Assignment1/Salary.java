package Assignment1;

import java.util.*;
import java.util.Scanner;

public class Salary {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the basic salary");
		double basic_salary = sc.nextDouble();
		double  hra=0, da=0, gross_salary ;
		if(basic_salary >=1 && basic_salary <= 4000) {
			hra= basic_salary *0.1;
			da = basic_salary *0.5;
		}
		else if(basic_salary >4000 && basic_salary <=8000) {
			hra = basic_salary * 0.2;
			da = basic_salary *0.6;
		}
		else if(basic_salary >8000 && basic_salary <=12000) {
			hra = basic_salary * 0.25;
			da = basic_salary *0.7;
		}
		else if(basic_salary >=12000) {
			hra = basic_salary * 0.3;
			da = basic_salary *0.8;
		}
		gross_salary= basic_salary + hra + da;
		System.out.println("hra Salary : " + hra);
		System.out.println("da :" + da);
		System.out.println("gross salary : "+gross_salary);
		sc.close();
		
	}

}

