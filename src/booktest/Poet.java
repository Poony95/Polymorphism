package booktest;

public class Poet extends Book {

	public Poet() {
		super();
	}

	public Poet(int number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int days) {
		return 600 * days;
	}

}
