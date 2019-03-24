package treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * This example shows how to create a TreeSet with a custom comparator that sorts the elements by ignoring the case.
 */

public class TreeSetCaseInsensitiveExample {

	public static void main(String[] args) {
//		TreeSet<String> fruits = new TreeSet<>(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				// TODO Auto-generated method stub
//				return o1.compareToIgnoreCase(o2);
//			}
//
//		});

		// more concise form
		 TreeSet<String> fruits = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		
		// TreeSet<String> fruits = new TreeSet<>();

		fruits.add("Banana");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("Orange");

		System.out.println("Fruits Set : " + fruits);
		
		// Now, lowercase elements will also be considered as duplicates

	}

}
