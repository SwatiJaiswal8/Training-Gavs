package java1;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        System.out.println("Queue: " + queue);  
        String removedElement = queue.remove();
        System.out.println("Removed from the queue: " + removedElement);
        System.out.println("Updated Queue: " + queue);
        String firstElement = queue.peek();
        System.out.println("First element in the queue: " + firstElement);  
        String searchElement = "Bob";
        if (queue.contains(searchElement)) {
            System.out.println(searchElement + " is present in the queue.");
        } else {
            System.out.println(searchElement + " is not present in the queue.");
        }
    }
}

