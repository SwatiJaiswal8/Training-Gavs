package java1;

import java.util.Scanner;

public class PizzaHut {

    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.init();
        cust.display();
        cust.setCustNo(21);
        int custNo = cust.getCustNo();
        System.out.println(custNo);
        cust.setCustName("Jyothi");
        String custName = cust.getCustName();
        System.out.println(custName);
        cust.setCustAddress("Chennai");
        String address = cust.getCustAddress();
        System.out.println(address);
        System.out.println("----------------");

        CustomerReport report = new CustomerReport();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter customer number:");
            int custNo1 = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter customer name:");
            String custName1 = sc.nextLine();
            System.out.println("Enter customer address:");
            String custAddress1 = sc.nextLine();
            Customer customer = new Customer(custNo1, custName1, custAddress1);
            report.addCustomer(customer);
        }
        System.out.println("Customer Report:");
        report.printList();

        Scanner scc = new Scanner(System.in);
        System.out.println("Select pizza type:");
        System.out.println("1. Italian Pizza");
        System.out.println("2. Mexican Pizza");
        int choice = scc.nextInt();
        scc.nextLine(); // Consume the newline character

        String type, toppings, name,size;
        int timeForPreparation;
        float costOfPizza ;
        boolean hasToppings;
        System.out.println("Enter pizza details:");
        System.out.print("Enter type of pizza: ");
        type = scc.nextLine();
        System.out.print("Enter toppings: ");
        toppings = scc.nextLine();
        System.out.print("Enter pizza name: ");
        name = scc.nextLine();
        System.out.print("Enter preparation time: ");
        timeForPreparation = scc.nextInt();
        scc.nextLine();
        System.out.println("enter the cost of pizza");
        costOfPizza = scc.nextFloat();
        scc.nextLine();
        System.out.println("Enter the size of pizza");
        size=scc.nextLine();
        System.out.print("Does the pizza have toppings? (true/false): ");
        hasToppings = scc.nextBoolean();
        Pizza pizza=null;
        try {
        if (choice == 1) {
        	
            pizza = new ItalianPizza(type, toppings, name, timeForPreparation,costOfPizza,size, hasToppings);}
        	
         else if (choice == 2) {
            pizza = new MexicanPizza(type, toppings, name, timeForPreparation,costOfPizza, size, hasToppings);
        } }
        catch (InvalidPizzaTypeException e) {
            System.out.println("Invalid Pizza Type: " + e.getMessage());
        } catch (InvalidPizzaSizeException e) {
            System.out.println("Invalid Pizza Size: " + e.getMessage());
        }

        System.out.println("Pizza Details:");
        System.out.println(pizza.toString());
    }
}
