package priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CompBasedPQ implements Comparator<Integer> {

	// Java program to demonstrate working of  
	// comparator based priority queue constructor
	public static void main(String[] args) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(new CompBasedPQ());
		pq.add(11);
		pq.add(33);
		pq.add(19);
		pq.add(22);
		pq.add(10);
		
		pq.iterator().forEachRemaining(i -> {
			System.out.println(i);
		});
		
	}
	
	@Override
	public int compare(Integer i, Integer j){
		if(i<j)
			return 1;
		return -1;
	}

}
