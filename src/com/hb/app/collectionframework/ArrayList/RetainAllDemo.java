package com.hb.app.collectionframework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> colors=new ArrayList<String>();
		ArrayList<String> sample =new ArrayList<String>();
		
		sample.add("BLUE");
		sample.add("BLACK");
		sample.add("RED");
		sample.add("YELLOW");
		sample.add("GREEN");
		
		colors.add("RED");
		colors.add("BLACK");
		colors.add("LAL");
		
		sample.retainAll(colors);
		
		Iterator<String> itr=sample.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
