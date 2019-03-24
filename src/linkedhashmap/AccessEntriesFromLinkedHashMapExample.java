package linkedhashmap;

import java.util.LinkedHashMap;

public class AccessEntriesFromLinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();

		customerIdNameMapping.put(1001, "Jack");
		customerIdNameMapping.put(1002, "David");
		customerIdNameMapping.put(1003, "Steve");
		customerIdNameMapping.put(1004, "Alice");
		customerIdNameMapping.put(1005, "Marie");

		System.out.println("customerIdNameMapping : " + customerIdNameMapping);

		// Check if a key exists in the LinkedHashMap
		System.out.println(customerIdNameMapping.containsKey(1002));

		// Change the value associated with an existing key
		customerIdNameMapping.put(1004, "Bob");
		System.out.println(customerIdNameMapping);
		
		// Remove a key from the LinkedHashMap only if it is mapped to the given value
		boolean removed=customerIdNameMapping.remove(1003, "Steve");
		System.out.println(removed);
		System.out.println(customerIdNameMapping);
	}

}
