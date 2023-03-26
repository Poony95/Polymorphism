// 이름, 금액, 할인율을 반영하여 정수형으로 형변환하여 호출하는 프로그램 작성
package product;

public class DiscountProduct extends Product {

	private double discount;
	
	public DiscountProduct() {
		super();
	}

	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	@Override
	public int getPrice() {
		return (int)(price - price * discount);
	}

	@Override
	public String toString() {
		return "DiscountProduct [discount=" + discount + ", name=" + name + ", price=" + price + "]";
	}

	

	
	
	
}
