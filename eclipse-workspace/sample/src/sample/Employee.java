package sample;

import java.util.Scanner;

class Demo {
    private String name;
    private int age;
    private double salary;

   
    public Demo(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

  
    public void calculateSalary(double basic, double hra, double da, double specialAllowance) {
        this.salary = basic + hra + da + specialAllowance;
    }

    
    public void calculateSalary(double basic, double hra, double da) {
        this.salary = basic + hra + da;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo[] arr = new Demo[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" name: ");
            String name = sc.nextLine();

            System.out.print(" age: ");
            int age = sc.nextInt();

            System.out.print(" basic salary: ");
            double basic = sc.nextDouble();

            System.out.print(" HRA: ");
            double hra = sc.nextDouble();

            System.out.print(" DA: ");
            double da = sc.nextDouble();

            
            int hasSpecialAllowance = sc.nextInt();
            double specialAllowance = 0;

            if (hasSpecialAllowance == 1) {
                System.out.print("Enter special allowance: ");
                specialAllowance = sc.nextDouble();
            }

            sc.nextLine();  

            
            if (hasSpecialAllowance == 1) {
                arr[i] = new Demo(name, age, basic);
                arr[i].calculateSalary(basic, hra, da, specialAllowance);
            } else {
                arr[i] = new Demo(name, age, basic);
                arr[i].calculateSalary(basic, hra, da);
            }
        }

        
        System.out.println("Employee Details:");
        for (Demo employee :arr) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            
        }

        sc.close();
    }
}
