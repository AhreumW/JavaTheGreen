package poly.hong;

public class Product {

	int price = 0; // 제품의 가격
	int count = 0;
	String productName = ""; // 제품의 이름
	
	Product(){
		super();
	}
	
	Product(String productName, int price, int count){
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
}
