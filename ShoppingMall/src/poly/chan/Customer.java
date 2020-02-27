package poly.chan;

// 물건을 구입할 수 있는 고객
public class Customer {

	String name = "";
	int money = 0;

	Customer(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	void info() {
		System.out.println(name + "님의 현재 남은 돈은 " + this.money + "원 입니다.");
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + "]";
	}
}
