package arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Write a Java program to insert an element into the array list at the first position.
 */
public class AddElementAtTheFirstPos {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5));

		list.add(0, 99);
		System.out.println(list);

	}

}
