package concepts.ntuedusg;

public class AddressEntry {

	private int num;
	private String Street;

	public AddressEntry(int num, String street) {
		super();
		this.num = num;
		Street = street;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Override
	public String toString() {
		return this.num + "," + this.Street+".";
	}
}
