package treeset;

public class Employee implements Comparable<Employee> {
	
	private String name;
	private Integer id;
	

	public Employee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		return this.getId() - emp.getId();
	}

}
