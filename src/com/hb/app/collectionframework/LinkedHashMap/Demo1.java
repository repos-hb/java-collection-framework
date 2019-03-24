package com.hb.app.collectionframework.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();
		
		lhm.put("ananya", 92.56);
		lhm.put("vasa", 88.63);
		lhm.put("jitu", 54.23);
		
		Set<Map.Entry<String, Double>> stu = lhm.entrySet();
		for(Map.Entry<String, Double> s:stu)
			System.out.println(s.getKey()+"-->"+s.getValue());

	}

}
