package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		// Create an array list.
		ArrayList<String> al = new ArrayList<>();
		System.out.println("Initial size of al: " +
				al.size());
		
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		
		System.out.println("Size of al after additions: " +
				al.size());
		// Display the array list.
		System.out.println("Contents of al: ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		// Remove elements from the array list.
		al.remove("F"); //using object
		al.remove(2); //from index
		
		System.out.println("Size of al after deletions: " +
				al.size());

		System.out.println("Contents of al: ");
		Iterator<String> itr1 = al.iterator();
		while(itr1.hasNext())
			System.out.println(itr1.next());
	}

}
