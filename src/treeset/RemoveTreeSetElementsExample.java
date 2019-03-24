package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class RemoveTreeSetElementsExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});

		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(30);
		numbers.add(42);
		numbers.add(49);
		numbers.add(50);

		System.out.println("numbers TreeSet : " + numbers);

		// Remove an element from the TreeSet
		System.out.println(numbers.remove(25));

		// Remove all elements divisible by 3
		numbers.removeIf(num -> num % 3 == 0);
		System.out.println(numbers);

		// Retrieve and remove the first element from the TreeSet
		System.out.println(numbers.pollFirst());

		// Retrieve and remove the last element from the TreeSet
		System.out.println(numbers.pollLast());

		System.out.println(numbers);
	}

}
