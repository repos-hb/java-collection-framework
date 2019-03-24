package com.hb.app.collectionframework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        list.add("Movie");
        list.add("Girl");
        
        System.out.println(list);
        
        Collections.shuffle(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
	}

}
