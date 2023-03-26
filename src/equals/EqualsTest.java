package equals;

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("예쁜이",29);
		Person p2 = new Person("예쁜이",29);
		/*
		if (p1 == p2) {
			System.out.println("같아요");
			
		}else {
			System.out.println("달라요");
		}
		*/
		if(p1.equals(p2)) {
			System.out.println("같아요");
		}else {
			System.out.println("달라요");
		}
	}

}
