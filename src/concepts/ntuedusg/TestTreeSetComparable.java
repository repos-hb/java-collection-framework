package concepts.ntuedusg;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSetComparable {

	public static void main(String[] args) {
		Book b1 = new Book(1, "shakespeare");
		Book b3 = new Book(3, "keats");
		Book b2 = new Book(4, "chaucer");
		Book b4 = new Book(2, "wordsworth");
		
		Set<Book> treeset = new TreeSet<>();
		treeset.add(b1);
		treeset.add(b4);
		treeset.add(b2);
		treeset.add(b3);
		
		//dups
		treeset.add(new Book(1, "picaso"));
				
		treeset.iterator().forEachRemaining(b -> {
			System.out.println(b.toString());
		});
	}

}
