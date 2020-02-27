
public class Customer {
	
	int money = 1000;		//소유금액
	int bonusPoint = 0;		//보너스점수
	
	
	void buy(Tv tv) {
		if(money < tv.price) {
			System.err.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money = money - tv.price;
		bonusPoint = bonusPoint + tv.bonusPoint;
		System.out.println(tv + "을 구입하셨습니다.");
	}
	
	//오버로딩
	void buy(Audio audio) {
		
	}

	@Override
	public String toString() {
		return "Customer [money=" + money + ", bonusPoint=" + bonusPoint + "]";
	}
	
	

}
