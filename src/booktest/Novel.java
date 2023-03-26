package booktest;

public class Novel extends Book {

	
	public Novel() {
		super();
	}

	public Novel(int number, String title, String author) {
		super(number, title, author);
	}

	@Override
	public int getLateFees(int days) {
		return 300 * days;
	}

}
