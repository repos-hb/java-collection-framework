package com.hb.app.collectionframework.Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDupFromArrayList {

	public static void main(String[] args) {
		// creating ArrayList with duplicate elements
		List<Integer> primes = new ArrayList<Integer>();
		
		primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);  //duplicate
        primes.add(7);
        primes.add(11);
        primes.add(1);
        primes.add(5);
        
        // let's print arraylist with duplicate 
        System.out.println("list of prime numbers : " + primes);
        
        System.out.println("after removing dup using hashset : " + removeDupUsingHashSet(primes));	//order changed
        
        System.out.println("after removing dup using linkedhashset : " + removeDupUsingLinkedHashSet(primes));	//order not changed
        
	}

	private static ArrayList removeDupUsingLinkedHashSet(List<Integer> primes) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>(primes);
		return new ArrayList<>(lhs);
	}

	private static ArrayList removeDupUsingHashSet(List<Integer> primes) {
		HashSet<Integer> hs = new HashSet<>(primes);
		return new ArrayList<>(hs);
		
	}

}
