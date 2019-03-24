package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;

public class ToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(7);
		
		Integer a[]= new Integer[al.size()];
		a= al.toArray(a);
		System.out.println(a.length);

	}

}
