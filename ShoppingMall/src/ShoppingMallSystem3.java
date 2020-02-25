
public class ShoppingMallSystem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		// alt + shift + r 하면 변수명 다 같이 수정가능
		// ctrl + shift + f 하면 자동정렬 

		Customer sangah = new Customer("상아", 33, 1000000);
		Customer hong = new Customer("홍", 27, 100000);
		Customer jaegun = new Customer("제건", 25, 900000);
		Customer woojin = new Customer("우진", 26, 500000);
		Customer hyeonseok = new Customer("현석", 27, 300000);
		Customer hwansang = new Customer("환상", 29, 90000);
		Customer jiwon = new Customer("지원", 25, 70000);
		Customer jaemin = new Customer("재민", 40, 100000);
		Customer yonghun = new Customer("용훈", 25, 50000);
		Customer jihun = new Customer("지훈", 26, 150000);

		ProductStore computerShop = new ProductStore("누구나 사고싶은 컴퓨터", 300000);

		ProductStore flowerShop = new ProductStore("특가할인 장미꽃", 5000);
		ProductStore fruitStore = new ProductStore("둘이 먹다 하나 죽는 꿀사과", 7000);
		ProductStore PhoneStore = new ProductStore("할인 전 핸드폰", 700000);
		ProductStore noteShop = new ProductStore("무지공책", 3000);
		ProductStore clothesStore = new ProductStore("기본 옷", 30000);

		computerShop.buy(sangah);
		computerShop.buy(hong);
		computerShop.buy(jaegun);
		computerShop.buy(woojin);
		computerShop.buy(hyeonseok);

		flowerShop.buy(hwansang);
		fruitStore.buy(jiwon);
		PhoneStore.buy(jaemin);
		noteShop.buy(yonghun);
		clothesStore.buy(jihun);

		//친구들 info
		sangah.info();
		hong.info();
		jaegun.info();
		woojin.info();
		hyeonseok.info();
		System.out.println(hwansang);
		System.out.println(jiwon);
		System.out.println(jaemin);
		System.out.println(yonghun);
		System.out.println(jihun);
		
//		System.out.println(sangah.name+"(" + sangah.age+") : " + sangah.money+"원 소지");
//		System.out.println(hong.name+"(" + hong.age+") : " + hong.money+"원 소지");
//		System.out.println(jaegun.name+"(" + jaegun.age+") : " + jaegun.money+"원 소지");
//		System.out.println(woojin.name+"(" + woojin.age+") : " + woojin.money+"원 소지");
//		System.out.println(hyeonseok.name+"(" + hyeonseok.age+") : " + hyeonseok.money+"원 소지");
//		System.out.println(hwansang.name+"(" + hwansang.age+") : " + hwansang.money+"원 소지");
//		System.out.println(jiwon.name+"(" + jiwon.age+") : " + jiwon.money+"원 소지");
//		System.out.println(jaemin.name+"(" + jaemin.age+") : " + jaemin.money+"원 소지");
//		System.out.println(yonghun.name+"(" + yonghun.age+") : " + yonghun.money+"원 소지");
//		System.out.println(jihun.name+"(" + jihun.age+") : " + jihun.money+"원 소지");
	
		//가게 info
		System.out.println("====== 가게정보 ======");
		System.out.println(computerShop);
		System.out.println(flowerShop);
		System.out.println(fruitStore);
		System.out.println(PhoneStore);
		System.out.println(noteShop);
		System.out.println(clothesStore);
		
//		System.out.println("====== 컴퓨터가게 ======");
//		System.out.println(computerShop.productName+" : " + computerShop.price 
//				+"원 / 총 가게소지금 : "+ computerShop.storeMoney + "원");
//		System.out.println("====== 꽃가게 ======");
//		System.out.println(flowerShop.productName +" : " + flowerShop.price
//				+"원 / 총 가게소지금 : "+  flowerShop.storeMoney+ "원");
//		System.out.println("====== 과일가게 ======");
//		System.out.println(fruitStore.productName+" : " +  fruitStore.price
//				+"원 / 총 가게소지금 : "+  fruitStore.storeMoney+ "원");
//		System.out.println("====== 핸드폰가게 ======");
//		System.out.println(PhoneStore.productName+" : " +  PhoneStore.price
//				+"원 / 총 가게소지금 : "+  PhoneStore.storeMoney+ "원");
//		System.out.println("====== 노트가게 ======");
//		System.out.println(noteShop.productName+" : " +  noteShop.price
//				+"원 / 총 가게소지금 : "+  noteShop.storeMoney+ "원");
//		System.out.println("====== 옷가게 ======");
//		System.out.println(clothesStore.productName +" : " +  clothesStore.price
//				+"원 / 총 가게소지금 : "+  clothesStore.storeMoney+ "원");
		
		
	}

}
