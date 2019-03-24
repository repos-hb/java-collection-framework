package hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateOverHashSetExample {

	public static void main(String[] args) {
		Set<String> programmingLanguages = new HashSet<>();
		programmingLanguages.add("C");
		programmingLanguages.add("C++");
		programmingLanguages.add("Java");
		programmingLanguages.add("Python");
		programmingLanguages.add("PHP");
		programmingLanguages.add("Ruby");

		System.out.println("=== Iterate over a HashSet using Java 8 forEach and lambda ===");
		programmingLanguages.forEach(lang -> {
			System.out.println(lang);
		});

		System.out.println("=== Iterate over a HashSet using iterator() ===");
		Iterator<String> itr = programmingLanguages.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=== Iterate over a HashSet using iterator() and Java 8 forEachRemaining() method ===");
		Iterator<String> itr2 = programmingLanguages.iterator();
		itr2.forEachRemaining(lang -> {
			System.out.println(lang);
		});

	}

}
