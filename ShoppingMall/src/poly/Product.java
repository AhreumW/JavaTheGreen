package poly;

public class Product{
	
	String productName = ""; 	//물건 이름
	int price = 0;
	
	Product(){
		
	}
	
	Product(int price){
		this.price = price;
	}
	
	
//	Product(String productName, int price){
//		this.productName = productName;
//		this.price = price;
//	}
	
	@Override
	public String toString() {
		return productName;
	}

}
