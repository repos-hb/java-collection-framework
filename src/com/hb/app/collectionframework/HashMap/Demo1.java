package com.hb.app.collectionframework.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
	public static void main(String a[]) {
		HashMap<String, Double> hm = new HashMap<>();
		
		hm.put("ananya", 92.56);
		hm.put("jitu", 54.23);
		hm.put("vasa", 88.63);
		
		System.out.println(hm);
		
		Set<Map.Entry<String, Double>> students = hm.entrySet();
		
		//Display the set
		for(Map.Entry<String, Double> s:students)
			System.out.println(s.getKey()+"-->"+s.getValue());
		
		//add 2 marks to ananya
		hm.put("ananya", hm.get("ananya")+2);
		System.out.println("\nananya's new no is: "+hm.get("ananya"));
	}

}
