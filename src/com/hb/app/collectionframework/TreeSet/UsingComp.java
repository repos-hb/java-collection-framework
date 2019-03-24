package com.hb.app.collectionframework.TreeSet;

import java.util.TreeSet;

public class UsingComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ts = new TreeSet<>(new MyComp());
		ts.add("f");
		ts.add("a");
		ts.add("c");
		ts.add("e");
		ts.add("d");
		ts.add("b");
		
		System.out.println(ts);
		
	}

}
