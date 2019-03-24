package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(11);
		pq.add(33);
		pq.add(19);
		pq.add(22);
		pq.add(10);
		System.out.println("The queue elements:");
		Iterator<Integer> itr = pq.iterator();
		itr.forEachRemaining(i -> {
			System.out.println(i);
		});
		
		System.out.println();
		
		int count = pq.size();
		while(count>0){
			System.out.println(pq.poll());
			count--;
		}

	}

}
