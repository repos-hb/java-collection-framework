package com.hb.app.collectionframework.TreeMap;

import java.util.Comparator;

public class EmplLastNameComp implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		String s0 = arg0;
		String s1 = arg1;
		int i = s0.lastIndexOf(' ');
		int j = s1.lastIndexOf(' ');
		int k = s0.substring(i).compareTo(s1.substring(j));
		if (k == 0) // last name match, check for entire name
			return s0.compareTo(s1);
		return k;
	}

}
