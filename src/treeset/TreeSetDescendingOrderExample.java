package treeset;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * The example below demonstrates how to create a TreeSet with a custom comparator that sorts the elements in descending order.
 */

public class TreeSetDescendingOrderExample {

	public static void main(String[] args) {
		TreeSet<String> fruits = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});

		// more concise form
		// TreeSet<String> fruits = new TreeSet<>(Comparator.reverseOrder());

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Orange");

		System.out.println("Fruits Set : " + fruits);

	}

}
