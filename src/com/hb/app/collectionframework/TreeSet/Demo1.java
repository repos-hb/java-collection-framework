package com.hb.app.collectionframework.TreeSet;

import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		
		ts.add("f");
		ts.add("a");
		ts.add("c");
		ts.add("e");
		ts.add("d");
		ts.add("b");
		
		System.out.println(ts);
		
		System.out.println("using NavigableSet methods");
		
		System.out.println(ts.subSet("c", "f"));
		System.out.println(ts.contains("a"));
		System.out.println(ts.contains("x"));

	}

}
