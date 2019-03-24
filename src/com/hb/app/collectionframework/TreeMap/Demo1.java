package com.hb.app.collectionframework.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String a[]) {
		TreeMap<String, Double> tm = new TreeMap<>();
		
		tm.put("ananya", 92.56);
		tm.put("jitu", 54.23);
		tm.put("vasa", 88.63);
		
		Set<Map.Entry<String, Double>> stu = tm.entrySet();
		
		for(Map.Entry<String, Double> s:stu)
			System.out.println(s.getKey()+"-->"+s.getValue());
	}
}
