package linkedhashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class IterateOverLinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<String, String> userCityMapping = new LinkedHashMap<>();

        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Chris", "London");
        userCityMapping.put("David", "Paris");
        userCityMapping.put("Jesse", "California");

        System.out.println("=== Iterating over a LinkedHashMap using Java 8 forEach and lambda ===");
        userCityMapping.forEach((person, city) -> {
        	System.out.println(person+ " => " + city);
        });
        
        System.out.println("\n=== Iterating over the LinkedHashMap's entrySet using Java 8 forEach and lambda ===");
        Set<Map.Entry<String, String>> userCityEntryset = userCityMapping.entrySet();
        userCityEntryset.forEach(entry->{
        	System.out.println(entry.getKey() +"--> "+entry.getValue() );
        });
        
        System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() ===");
        Iterator<Map.Entry<String, String>> itr = userCityMapping.entrySet().iterator();
        while(itr.hasNext()){
        	Map.Entry<String, String> entry = itr.next();
        	System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        
        System.out.println("\n=== Iterating over the entrySet of a LinkedHashMap using iterator() and forEachRemaining ===");
        Iterator<Map.Entry<String, String>> itr2 = userCityMapping.entrySet().iterator();
        itr2.forEachRemaining(entry -> {
        	System.out.println(entry.getKey()+"--->>"+entry.getValue());
        });

	}

}
