package com.hb.app.collectionframework.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		
		// Add elements to the linked list.
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addFirst("Z");
		ll.addLast("A");
		
		ll.add(1, "A2");
		System.out.println(ll);
		
		ll.offerFirst("Z2");
		ll.offerLast("A3");
		System.out.println(ll);
		
		// Remove elements from the linked list.
		ll.remove(0);
		ll.removeLast();
		System.out.println(ll);
		System.out.println(ll.size());
		
		// Get and set a value.
		String val = ll.get(3);
		ll.set(ll.size()-1, val+"_CHANGED");
		System.out.println(ll);
	}
}
