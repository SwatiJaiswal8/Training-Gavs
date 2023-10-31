package java1;

//import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> myQueue =new LinkedList<>();
		Queue<Integer> myQueue =new PriorityQueue<Integer>();
		myQueue.add(4);
		myQueue.add(12);
		myQueue.add(5);
		myQueue.add(67);
		myQueue.add(2);
		myQueue.add(4);
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
		myQueue.offer(9);
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue);
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
		System.out.println(myQueue.poll());
	}

}
