package com.hb.app.collectionframework.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AddArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> arrl = new LinkedList<String>();
        //adding elements to the end
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual LinkedList:"+arrl);
        
        List<String> l = new ArrayList<>();
        l.add("one");
        l.add("two");
        
        arrl.addAll(l);
        
        System.out.println("After Copy: "+arrl);
        
        arrl.clear();
        arrl.addAll(l);
        
        System.out.println("After Copy: "+arrl);
	}

}
