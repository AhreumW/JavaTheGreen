
public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		
		System.out.println(customer);
		
		customer.buy(new Tv());		//단 한번 사용할 땐, 이런식으로도 함.

		System.out.println("현내 남은 돈은 "+customer.money+"만원입니다.");
		System.out.println("현내 보너스 점수는 "+customer.bonusPoint+"점입니다.");
		
		customer.buy(new Audio());		 

		System.out.println("현내 남은 돈은 "+customer.money+"만원입니다.");
		System.out.println("현내 보너스 점수는 "+customer.bonusPoint+"점입니다.");
		
		
		customer.buy(new Computer());		 

		System.out.println("현내 남은 돈은 "+customer.money+"만원입니다.");
		System.out.println("현내 보너스 점수는 "+customer.bonusPoint+"점입니다.");
		
		System.out.println(customer);
	}

}
