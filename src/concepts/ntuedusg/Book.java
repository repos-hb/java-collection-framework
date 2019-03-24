package concepts.ntuedusg;

public class Book implements Comparable<Book> {

	private int id;
	private String title;

	public Book(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int compareTo(Book b) {
		return b.id - this.id;
	}

	@Override
	public String toString() {
		return this.id + ":" + this.title;
	}
}
