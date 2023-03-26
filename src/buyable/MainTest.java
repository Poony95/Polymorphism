package buyable;

public class MainTest {
	public static void printPrice(Buyable item) {
		System.out.printf("%10d\n", item.getPrice());
			}
	public static void main(String[] args) {
		Buyable b1 = new Refrigerator("냉장고", "삼성", 500000);
		Buyable b2 = new Television("건조기", "엘지", 2000000);
		
		printPrice(b1);
		
		System.out.println(b1.getPrice());
		System.out.println(b1); //toString
	}

}
