package product;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product("칫솔", 2000);
		Product p2 = new DiscountProduct("가방", 3000, 0.25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.setName("소스");		// 동일한 클래스의 set의 값을 변화시킨 것이기에 아래의 값들도 계속해서 바뀌어 나타남.
		System.out.println(p1);	 //toString은 자동으로 메소드 동작하므로 안적어도됨.
		System.out.println(p1.getName());
		System.out.println(p2);
	}

}
