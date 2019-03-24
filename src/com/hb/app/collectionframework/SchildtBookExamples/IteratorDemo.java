package com.hb.app.collectionframework.SchildtBookExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(2);
		al.add(5);
		al.add(9);
		al.add(4);
		al.add(3);
		
		// Use iterator to display contents of al.
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("\n");
		
		// Modify objects being iterated using ListIterator.
		ListIterator<Integer> litr = al.listIterator();
		while (litr.hasNext()) {			
			litr.set(litr.next()+1);
		}
		System.out.println("\n");
		
		//for-each
		for(Integer i:al){
			System.out.println(i);
		}

	}

}
