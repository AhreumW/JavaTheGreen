package poly.chan;

// 어떤 단 하나의 물건만 팔수있는 매장
public class ProductStore {

	int storeMoney = 0; // 주인장의 소지금

	Mask mask = new Mask();
	Ethanol ethanol = new Ethanol();

	void ethanolSell(Customer customer) {

		if (customer.money >= ethanol.price) {
			customer.money = customer.money - ethanol.price;
			storeMoney = storeMoney + ethanol.price;
			System.out.println(customer.name + " 님이");
			System.out.println(ethanol.productName + "를 구입하셨습니다.");
		} else {
			System.out.println(customer.name + " 님이");
			System.err.println(ethanol.productName + "제품을 구입하기에 ");
			System.err.println(customer.money - ethanol.price + " 원 부족합니다.");
			return;
		}
	}

	void maskSell(Customer customer) {

		if (customer.money >= mask.price) {
			customer.money = customer.money - mask.price;
			storeMoney = storeMoney + mask.price;
			System.out.println(customer.name + " 님이");
			System.out.println(mask.productName + "를 구입하셨습니다.");
		} else {
			System.out.println(customer.name + " 님이");
			System.err.println(mask.productName + "제품을 구입하기에 ");
			System.err.println(customer.money - mask.price + " 원 부족합니다.");
			return;
		}
	}

}
