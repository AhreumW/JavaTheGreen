package poly;

// 어떤 단 하나의 물건만 팔수있는 매장
public class Store{
	
	int storeMoney = 0;  // 주인장의 소지금
	
	Mask mask = new Mask();
	Ethanol ethanol = new Ethanol();
	
	Product sellproduct = new Product();
	
	Store(){
		storeMoney = 1000000; // 초기자금은 무조건 100만원
	}
	
	void buy(Customer customer, String productname){	//최소단위를 customer객체 로 받음
		/*
		if(product instanceof Mask) {
			instanceof를 이용할 수 있다. 
		}
		*/
		if(productname.equals("mask")) {
			customer.money = customer.money - mask.price;
			System.out.println(mask.productName + "을/를 구입하셨습니다.");	
			sellproduct = mask;
		}else if(productname.equals("ethanol")) {
			customer.money = customer.money - ethanol.price;
			System.out.println(ethanol.productName + "을/를 구입하셨습니다.");	
			sellproduct = ethanol;
		}else {
			System.out.println("해당 상품은 없습니다.");
		}
		
		
	}
	

	//toString은 모든 메서드의 맨 마지막에 위치한다. 
	@Override
	public String toString() {
		return "Store [storeMoney=" + storeMoney 
				+ ", price=" + sellproduct.price + ", productName=" + sellproduct.productName + "]";
	}
	
	
}
