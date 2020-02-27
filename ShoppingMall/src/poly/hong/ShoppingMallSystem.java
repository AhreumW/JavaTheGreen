package poly.hong;

public class ShoppingMallSystem {

	public static void main(String[] args) {
		
//		가게 - 물건이 있어야만 판매한다 ( 에탄올, 마스크 )
//		물건 - 물건(가격), 에탄올(2500), 마스크(4000)
//		고객 - 사람은 가게에 들어가서 물건을 구입할 수 있다
//		
//		가게는 1개, 고객은 2명
//		고객명 각자 하나씩만 구매한다.
		
		ProductStore productstore = new ProductStore();
		Customer hong = new Customer("김홍", 27, 50000);
		Customer sangah = new Customer("박상아", 33, 5000);
		
		productstore.buy(hong, "마스크");
		productstore.buy(sangah, "에탄올");
		productstore.buy(sangah, "에탄올");
//		손님이 구매했는지 확인하기
		System.out.println("김홍 구매목록 : " + hong.myBuyProduct);
		System.out.println("박상아 구매목록 : " + sangah.myBuyProduct);
//		데이터 확인
		System.out.println(hong);
		System.out.println(sangah);
		
	} // main
}