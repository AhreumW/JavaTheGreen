package poly.hong;

// 어떤 단 하나의 물건만 팔수있는 매장
public class ProductStore {
	
	Mask mask = new Mask();
	Ethanol ethanol = new Ethanol();

	ProductStore(){
		
	}
	
	void buy(Customer customer, String product){
		//product 구별
		if((product).equals("마스크")) {
			if(customer.money >= mask.price){
				if(mask.count > 0) {
					customer.money = customer.money - mask.price; 
					customer.myBuyProduct = mask.productName;
					mask.count--;
					System.out.println(customer.name + "바보님이 " + mask.productName + "를 구입하셨습니다.");
					System.out.println("남은 마스크 개수 : " + mask.count);
				}else {
					System.out.println("마스크 재고가 없습니다.");
				}
			}else{
				System.err.println(mask.productName + "제품을 구입하기에 ");
				System.err.println(customer.money - mask.price + " 원 부족합니다.");
			}
			
		}else if((product).equals("에탄올")) {
			if(customer.money >= ethanol.price){
				if(ethanol.count > 0) {
					customer.money = customer.money - ethanol.price; 
					customer.myBuyProduct = ethanol.productName;
					ethanol.count--;
					System.out.println(customer.name + "천재님이 " + ethanol.productName + "를 구입하셨습니다.");
					System.out.println("남은 에탄올 개수 홍이는 바보 : " + ethanol.count);
				}else {
					System.out.println("멍충멍충 에탄올 재고가 없습니다.");
				}
			}else{
				System.err.println(ethanol.productName + "바보바보 제품을 구입하기에 ");
				System.err.println(customer.money - ethanol.price + "멍충이 원 부족합니다.");
			}
		}
		
	}

	
}
