package java1;

import java.util.Scanner;

public class Delivery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter pizza type (Veg/Non-Veg): ");
        String type = scanner.nextLine();

        System.out.println("Enter pizza size (Small/Medium): ");
        String size = scanner.nextLine();

        System.out.println("Do you want to add toppings? (yes/no): ");
        String toppingsChoice = scanner.nextLine();
        boolean hasToppings = toppingsChoice.equalsIgnoreCase("yes");

       
        ItalianPizza italianPizza = new ItalianPizza(type, "Mushrooms", "Margherita", 20, 200, size, hasToppings );

       
        System.out.println("Pizza Details:");
        System.out.println(italianPizza.toString());
        System.out.println("Total Cost: $" + italianPizza.calculateCost());

        scanner.close();
    }
}
