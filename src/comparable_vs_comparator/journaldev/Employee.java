package comparable_vs_comparator.journaldev;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int age;
	private long salary;

	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	@Override
    //this is overridden to print the user-friendly information about the Employee
    public String toString() {
        return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", salary=" +
                this.salary + "]\n";
    }
	
	@Override
	public int compareTo(Employee e){
		//let's sort the employee based on an id in ascending order
        //returns a negative integer, zero, or a positive integer as this employee id
        //is less than, equal to, or greater than the specified object.
		return this.id - e.id;
	}
	
	/**
     * Comparator to sort employees list or array in order of Salary
     */
	public static Comparator<Employee> salComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {

			return (int) (e1.salary - e2.salary);
		}
	};
	
	/**
     * Comparator to sort employees list or array in order of Age
     */
	public static Comparator<Employee> ageComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.age - o2.age;
		}
	};
	
	/**
     * Comparator to sort employees list or array in order of Name
     */
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
}
