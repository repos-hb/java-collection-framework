package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a Java program to compare two array lists.
 */
public class CompareTwoLists {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

		list1.add(0, 99);
		
		List<Integer> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(1,2,3,4,5,99));
		
		System.out.println(list1.containsAll(list2));

	}

}
