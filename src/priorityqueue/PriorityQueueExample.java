package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {

		// Creating empty priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		// Adding items to the pQueue using add()
		pq.add(11);
		pq.add(33);
		pq.add(19);
		pq.add(22);
		pq.add(10);

		// Printing the most priority element, peek()
		System.out.println(pq.peek());

		// Printing all elements
		System.out.println("The queue elements:");
		Iterator<Integer> itr = pq.iterator();
		itr.forEachRemaining(i -> {
			System.out.println(i);
		});

		// Removing the top priority element (or head) and
		// printing the modified pQueue using poll()
		System.out.println(pq.poll());
		System.out.println("After removing an element" + 
                "with poll function:"); 
		Iterator<Integer> itr1 = pq.iterator();
		itr1.forEachRemaining(i -> {
			System.out.println(i);
		});
		
		// using remove()
		pq.remove();
		System.out.println("after removing Java with" + 
                " remove function:");
		Iterator<Integer> itr11 = pq.iterator();
		itr11.forEachRemaining(i -> {
			System.out.println(i);
		});
		
		pq.remove(33);
		System.out.println("after removing Java with" + 
                " remove function:");
		Iterator<Integer> itr111 = pq.iterator();
		itr111.forEachRemaining(i -> {
			System.out.println(i);
		});
	}

}
