package concepts.ntuedusg;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreesetComparator {


	public static Comparator<AddressEntry> addressComparator = new Comparator<AddressEntry>() {

		@Override
		public int compare(AddressEntry o1, AddressEntry o2) {
			// TODO Auto-generated method stub
			return o1.getStreet().compareToIgnoreCase(o2.getStreet());
		}
	};
	
	public static void main(String a[]) {

		AddressEntry add1 = new AddressEntry(146, "CKB Layout");
		AddressEntry add2 = new AddressEntry(221, "Baker St.");
		AddressEntry add3 = new AddressEntry(2, "Lovelock Lane");

		TreeSet<AddressEntry> treeset = new TreeSet<>(addressComparator);
		treeset.add(add1);
		treeset.add(add2);
		treeset.add(add3);
		

		treeset.iterator().forEachRemaining(add -> {
			System.out.println(add.toString());
		});
		

		Set<AddressEntry> newset = treeset.descendingSet();
		newset.iterator().forEachRemaining(add -> {
			System.out.println(add.toString());
		});
	}
	
}
