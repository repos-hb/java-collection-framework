package com.hb.app.collectionframework.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String a[]){
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("test");
		System.out.println(hs);
	}

}
