package com.hb.app.collectionframework.Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		// creating ArrayList with duplicate elements
		List<Integer> primes = new ArrayList<Integer>();
		
		primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(1);
        primes.add(5);
        
        // let's print arraylist  
        System.out.println("list of prime numbers : " + primes);
        
        // reverse  
        Collections.reverse(primes);
        System.out.println("list of prime numbers : " + primes);

	}

}
