package com.hb.app.collectionframework.LinkedList;

import java.util.LinkedList;

public class Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        LinkedList<String> clone = (LinkedList<String>) arrl.clone();
        System.out.println("Cloned LinkedList:"+clone);
	}

}
