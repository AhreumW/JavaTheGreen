package poly;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		가게
//		물건
//		고객
//		
//		가게에는 물건이 있어야만 판매한다. 
//		에탄올(2500), 마스크(4000)
//		사람은 가게에 들어가서 물건을 구입할 수 있다.
//		
//		store.buy(human)
		
//		가게는 유일하다. 
//		
//		고객은 2사람 존재한다. 첫사람이 에탄올사면 두번째느느 에탄올 못삼
//		각자 하나만 구매한다. 
		
		Customer person1 = new Customer("One", 21, 100000);
		Customer person2 = new Customer("Two", 27, 50000);
		
		Store store = new Store();
		store.buy(person1,"mask");
		store.buy(person2,"ethanol");
		
		person1.info();
		person2.info();
		
		
	}

}
