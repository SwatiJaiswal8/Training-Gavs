package java1;
import java.util.Date;
import java.util.Scanner;

public class Reception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter order number: ");
        int orderNo = scanner.nextInt();
        Date orderDate = new Date();
        System.out.print("Enter cost: ");
        int cost = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter customer name: ");
        String custName = scanner.nextLine();

        System.out.print("Enter customer address: ");
        String custAddress = scanner.nextLine();

        System.out.print("Enter approximate distance (in km): ");
        int approxDistance = scanner.nextInt();

       
        Order order = new Order(orderNo, orderDate, cost, custName, custAddress, approxDistance);

       
        if (order.delivery()) {
            System.out.println("Order is deliverable!");
        } else {
            System.out.println("Order is not deliverable.");
        }

        scanner.close();
    }
}
