package hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "one");
		hashmap.put(2, "two");
		hashmap.put(3, "three");
		hashmap.put(3, "three");
		
		// Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
		hashmap.putIfAbsent(4, "four");
		
		System.out.println(hashmap);

	}

}
