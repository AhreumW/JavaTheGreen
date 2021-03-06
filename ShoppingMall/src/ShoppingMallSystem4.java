
public class ShoppingMallSystem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 10명의 같은 반 동기들을 생성
		// 5명의 친구들은 모두 컴퓨터를 구입한다
		// 나머지 5명의 친구들은 전혀 다른 가게에서 물건을 하나 구입하시오.
		// 그리고 각 친구들의 정보를 출력
		// 각 가게의 정보를 출력하시오

		// alt + shift + r 하면 변수명 다 같이 수정가능
		// ctrl + shift + f 하면 자동정렬 

		Customer[] classmateArr = new Customer[10];
		
		classmateArr[0] = new Customer("상아", 33, 1000000);
		classmateArr[1] = new Customer("홍", 27, 100000);
		classmateArr[2] = new Customer("제건", 25, 900000);
		classmateArr[3] = new Customer("우진", 26, 500000);
		classmateArr[4] = new Customer("현석", 27, 300000);
		classmateArr[5] = new Customer("환상", 29, 90000);
		classmateArr[6] = new Customer("지원", 25, 70000);
		classmateArr[7] = new Customer("재민", 40, 100000);
		classmateArr[8] = new Customer("용훈", 25, 50000);
		classmateArr[9] = new Customer("지훈", 26, 150000);

		
		ProductStore computerShop = new ProductStore("누구나 사고싶은 컴퓨터", 300000);
		ProductStore flowerShop = new ProductStore("특가할인 장미꽃", 5000);
		ProductStore fruitStore = new ProductStore("둘이 먹다 하나 죽는 꿀사과", 7000);
		ProductStore PhoneStore = new ProductStore("할인 전 핸드폰", 700000);
		ProductStore noteShop = new ProductStore("무지공책", 3000);
		ProductStore clothesStore = new ProductStore("기본 옷", 30000);
		
		
		for(int i =0; i<classmateArr.length/2; i++) {
			computerShop.buy(classmateArr[i]);
		}

		flowerShop.buy(classmateArr[5]);
		fruitStore.buy(classmateArr[6]);
		PhoneStore.buy(classmateArr[7]);
		noteShop.buy(classmateArr[8]);
		clothesStore.buy(classmateArr[9]);

		//친구들 info
		System.out.println("====== 친구들정보 ======");
		for(int i =0; i<classmateArr.length; i++) {
			System.out.println(classmateArr[i]);
		}
		
		//가게 info
		System.out.println("====== 가게정보 ======");
		System.out.println(computerShop);
		System.out.println(flowerShop);
		System.out.println(fruitStore);
		System.out.println(PhoneStore);
		System.out.println(noteShop);
		System.out.println(clothesStore);
		
		
	}

}
