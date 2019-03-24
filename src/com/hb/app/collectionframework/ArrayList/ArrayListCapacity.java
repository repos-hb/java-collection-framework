package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;

public class ArrayListCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al.size());
		al.ensureCapacity(10);
		System.out.println(al.size());
		al.add("hello");
		al.add("world");
		al.add("java");
		System.out.println(al.size());
		al.remove(0);
		al.trimToSize();
		System.out.println(al.size());
	}

}
