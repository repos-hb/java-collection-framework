package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {

	public static void main(String[] args) {
		Map<String, String> countryISOCodeMapping = new HashMap<>();

		countryISOCodeMapping.put("India", "IN");
		countryISOCodeMapping.put("United States of America", "US");
		countryISOCodeMapping.put("Russia", "RU");
		countryISOCodeMapping.put("Japan", "JP");
		countryISOCodeMapping.put("China", "CN");

		// HashMap's entry set
		Set<Map.Entry<String, String>> countryISOCodeMappingEntryset = countryISOCodeMapping.entrySet();
		Iterator<Map.Entry<String, String>> itr = countryISOCodeMappingEntryset.iterator();
		itr.forEachRemaining(countryISOCode -> {
			System.out.println(countryISOCode);
		});
		
		System.out.println();
		
		// HashMap's key set
		Set<String> countries = countryISOCodeMapping.keySet();
		for(String s: countries){
			System.out.println(countryISOCodeMapping.get(s));
		}
		
		// HashMap's values
		Collection<String> isoCodes = countryISOCodeMapping.values();
		System.out.println(isoCodes);
	}

}
