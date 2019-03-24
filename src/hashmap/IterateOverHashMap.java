package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {

	public static void main(String[] args) {
		Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);
        
        System.out.println("=== Iterating over a HashMap using Java 8 forEach and lambda ===");
        employeeSalary.forEach((emp, salary) -> {
        	System.out.println(emp + " => " + salary);
        });
        
        System.out.println("\n=== Iterating over the HashMap's entrySet using iterator() ===");
        Set<Map.Entry<String, Double>> employeeSalaryEntryset = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Double>> itr = employeeSalaryEntryset.iterator();
        while(itr.hasNext()){
        	System.out.println(itr.next());
        }

        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        employeeSalary.entrySet().forEach(entry -> {
        	System.out.println(entry.getKey() + " "+ entry.getValue());
        });
	}

}
