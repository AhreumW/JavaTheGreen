package poly.hong;

// 물건을 구입할 수 있는 고객
public class Customer {

	String name = "";
	int age = 0;
	int money = 0;
	String myBuyProduct = ""; // 내가 구입한 단 하나의 물건

	Customer(String name, int age, int money) {
		this.name = name;
		this.age = age;
		this.money = money;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + 
				", money=" + money + 
				", myBuyProduct=" + myBuyProduct + "]";
	}

}
