package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<>();
		
		// Add elements to the array list.
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("Contents of al: " + al);

		// Get the array.
		Integer arr[] = new Integer[al.size()];
		arr=al.toArray(arr);
		
		int sum =0;
		for(int i:arr) sum+=i;
		
		System.out.println("Sum is: " + sum);
	}

}
