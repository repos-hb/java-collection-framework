package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;

public class EnsureCapTrimToSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("before adding anything: "+al.size());
		
		al.add(6);
		al.add(9);
		al.add(4);
		al.add(7);

		System.out.println("after adding values: "+al.size());
		
		al.ensureCapacity(2);

		al.add(34);
//		al.add(63);
		System.out.println("after ensureCap 2: "+al.size());
		
		al.trimToSize();
		System.out.println("after trimToSize: "+al.size());
	}

}
