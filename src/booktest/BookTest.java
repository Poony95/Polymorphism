package booktest;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Novel(100, "자바와함께", "최광식");
		Book b2 = new Novel(200, "자바의이해", "신혜정");
		Book b3 = new Novel(300, "신기한자바", "이아현");
		
		System.out.println("** 반납 도서 정보 **");
		System.out.println(b1);
		System.out.println("연체료 : "+ b1.getLateFees(2));
		System.out.println("--------------------------");
		System.out.println(b2);
		System.out.println("연체료 : "+ b2.getLateFees(2));
		System.out.println("--------------------------");
		System.out.println(b3);
		System.out.println("연체료 : "+ b3.getLateFees(2));
		
	}

}
