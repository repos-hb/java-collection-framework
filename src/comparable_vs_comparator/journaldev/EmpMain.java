package comparable_vs_comparator.journaldev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpMain {

	public static void main(String[] args) {

		// sorting object array
		Employee[] empArr = new Employee[4];
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);

		// sorting employees array using Comparable interface implementation
		Arrays.sort(empArr);
		System.out.println("Default Sorting of Employees list:\n" + Arrays.toString(empArr));

		// sort employees array using Comparator by Salary
		Arrays.sort(empArr, Employee.salComparator);
		System.out.println("Employees list sorted by Salary:\n" + Arrays.toString(empArr));

		// sort employees array using Comparator by Age
		Arrays.sort(empArr, Employee.ageComparator);
		System.out.println("Employees list sorted by Age:\n" + Arrays.toString(empArr));

		// sort employees array using Comparator by Name
		Arrays.sort(empArr, Employee.NameComparator);
		System.out.println("Employees list sorted by Name:\n" + Arrays.toString(empArr));

		// Employees list sorted by ID and then name using Comparator class
		List<Employee> empList = new ArrayList<>();
		empList.addAll(Arrays.asList(empArr));
		empList.add(new Employee(1, "Acid", 25, 10000));
		Collections.sort(empList, new EmployeeComparatorByIdAndName());
		System.out.println("Employees list sorted by ID and Name:\n"+empList);
	}

}
