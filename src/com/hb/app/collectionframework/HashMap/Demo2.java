package com.hb.app.collectionframework.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> map = new HashMap<String, Integer>()
				{{
					put("hb", 11);
					put("sm", 22);
					put("sp", 33);
					put("am", 44);
				}};
				
		System.out.println(map);
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		
		es.iterator().forEachRemaining(en -> {
			System.out.println(en.getKey()+":"+en.getValue());
		});

	}

}
