package Assignment1;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();
        if (num >= 1000 && num <= 9999) {
            int ogNumber = num;
            int revNumber = 0;
            while (num != 0) {
                int digit = num % 10;
                revNumber = revNumber * 10 + digit;
                num /= 10;
            }
            if (ogNumber == revNumber) {
                System.out.println("Reversed number: " + revNumber);
                System.out.println("The number is a palindrome.");
            } else {
                System.out.println("Reversed number: " + revNumber);
                System.out.println("The number is not a palindrome.");
            }
        } else {
            System.out.println("number must be 4 digit number");
        }

        sc.close();
    }
}

