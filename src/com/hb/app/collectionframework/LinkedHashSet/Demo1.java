package com.hb.app.collectionframework.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo1 {
	public static void main(String a[]){
		LinkedHashSet<String> lhset = new LinkedHashSet<>();
		
		lhset.add("aaa");
		lhset.add("aaa");
		lhset.add("bbb");
		lhset.add("ccc");
		lhset.add("ddd");
		lhset.add("aaa");
		
		Iterator<String> itr = lhset.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
