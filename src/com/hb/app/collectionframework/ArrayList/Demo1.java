package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("bingo");
		names.add("kench");
		names.add("bingo");
		names.add("rassa");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println("\n");
		
		for(String s:names)
			System.out.println(s);
	}

}
