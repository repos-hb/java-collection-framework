package com.hb.app.collectionframework.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<>();
		
		set.add(2);
		set.add(5);
		set.add(7);
		set.add(1);
		set.add(5);
		
		Iterator<Integer> itr = set.iterator();
		
		itr.forEachRemaining(value -> {
			System.out.println(value);
		});
		
//		while(itr.hasNext())
//			System.out.println(itr.next());
	}

}
