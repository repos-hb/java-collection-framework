package com.hb.app.collectionframework.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.hb.app.collectionframework.Util.Empl;


public class EmplLastName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<String, Empl> tm = new TreeMap<>(new EmplLastNameComp());
		
		tm.put("john doe", new com.hb.app.collectionframework.Util.Empl("e1", 5000));
		tm.put("johny doe", new Empl("e2", 2300));
		tm.put("greg maxwell", new Empl("e3", 7000));
		tm.put("al pacino", new Empl("e4", 8800));
		tm.put("steve spielberg", new Empl("e5", 5830));
		
		Set<Map.Entry<String, Empl>> emp = tm.entrySet();
		for(Map.Entry<String, Empl> e:emp)
			System.out.println(e.getKey()+"-->"+e.getValue());

	}

}
