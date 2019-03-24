package treeset;

import java.util.TreeSet;

public class AccessTreeSetElementsExample {

	public static void main(String[] args) {
		TreeSet<String> students = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

		students.add("Julia");
		students.add("Robert");
		students.add("Mark");
		students.add("Steven");

		System.out.println("Students TreeSet : " + students);

		// Finding the size of a TreeSet
		System.out.println("Number of elements in the TreeSet : " + students.size());

		// Check if an element exists in the TreeSet
		String name = "Julia";
		System.out.println(students.contains(name));

		// Navigating through the TreeSet
		System.out.println("first: " + students.first());
		System.out.println("last: " + students.last());

		name = "Robert";
		System.out.println("gt: " + students.higher(name));
		System.out.println("lt: " + students.lower(name));

	}

}
