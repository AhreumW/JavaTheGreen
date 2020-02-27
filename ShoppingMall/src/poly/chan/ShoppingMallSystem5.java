package poly.chan;

public class ShoppingMallSystem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 가게에는 물건이 있어야만 판매한다.
		// 에탄올(2500원), 마스크(4000원)

		// 사람은 가게에 들어가서 물건을 구입할 수 있다.

		// 가게는 유일하다

		// 고객은 2사람만 존재한다.
		// 각자 하나만 구매한다.
		ProductStore p = new ProductStore();

		Customer c1 = new Customer("이찬양", 10000);
		p.maskSell(c1);
		c1.info();

		System.out.println();

		Customer c2 = new Customer("이정주", 100000);
		p.ethanolSell(c2);
		c2.info();

	}
}
