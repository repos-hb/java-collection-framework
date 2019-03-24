package com.hb.app.collectionframework.TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(27);
		ts.add(78);
		ts.add(12);
		ts.add(10);
		ts.add(98);
		
		System.out.println(ts);
		System.out.println(ts.subSet(10, 20));
		System.out.println(ts.subSet(10, true, 20, false));
	}

}
