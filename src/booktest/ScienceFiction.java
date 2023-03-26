package booktest;

public class ScienceFiction extends Book {

	public ScienceFiction() {
		super();
	}

	public ScienceFiction(int number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int days) {
		return 600 * days;
	}

}
