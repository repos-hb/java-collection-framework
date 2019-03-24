package comparable_vs_comparator.comparatorwithcustomtypes;

public class Student {

	private int roll;
	private double number;

	public Student(int roll, double number) {
		super();
		this.roll = roll;
		this.number = number;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}
	
	@Override
	public String toString(){
		return String.format("roll:%d --> %f", roll, number);
	}

}
