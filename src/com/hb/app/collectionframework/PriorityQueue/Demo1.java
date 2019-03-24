package com.hb.app.collectionframework.PriorityQueue;

import java.util.PriorityQueue;

public class Demo1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.offer(3);
		pq.offer(5);
		pq.offer(9);
		pq.offer(2);
		pq.offer(7);
		
		System.out.println(pq);
		System.out.println("element at head: "+pq.element());
		pq.remove();
		System.out.println(pq);
		System.out.println("polling: "+pq.poll());
		System.out.println(pq);

	}

}
