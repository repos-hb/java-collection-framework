package com.hb.app.collectionframework.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstDuplicate {

	public static void main(String[] args) {
		System.out.println(firstDuplicate(new int[] { 2, 1, 3, 5, 3, 2 }));

	}

	public static int firstDuplicate(int[] a) {
		int dupIndex = -1;
		HashMap<Integer, Integer> dupCount = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!dupCount.containsKey(a[i])) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j])
						dupIndex = j;
				}
				dupCount.put(a[i], dupIndex);
				
			}
		}

		System.out.println(dupCount);
		// int minDupValue = a.length;
		// for (int i : a) {
		// System.out.println(dupCount.get(i));
		// System.out.println(minDupValue);
		// if (dupCount.get(i) <= minDupValue)
		// minDupValue = i;
		// }

		return Collections.min(dupCount.values());
	}

}
