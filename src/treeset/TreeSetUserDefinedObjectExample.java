package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUserDefinedObjectExample {

	public static void main(String[] args) {
		
		TreeSet<Employee> employees = new TreeSet<>();	// uses Employee classe's compareTo method for sorting
		employees.add(new Employee("Rajeev", 1010));
        employees.add(new Employee("Sachin", 1005));
        employees.add(new Employee("Chris", 1008));
        
        System.out.println("Employees (sorted based on Employee class's compareTo() function)");
        Iterator<Employee> itr = employees.iterator();
        itr.forEachRemaining(emp -> {
        	System.out.println(emp.getId());
        });
        
        TreeSet<Employee> employees1 = new TreeSet<>(Comparator.comparing(Employee::getName));	// using custom comparator
        employees1.add(new Employee("Rajeev", 1010));
        employees1.add(new Employee("Sachin", 1005));
        employees1.add(new Employee("Chris", 1008));
        
        itr = employees1.iterator();
        itr.forEachRemaining(emp -> {
        	System.out.println(emp.getId()+" : "+emp.getName());
        });

	}

}
