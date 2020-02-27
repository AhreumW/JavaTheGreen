package poly;

// 물건을 구입할 수 있는 고객
public class Customer {
	
	String name = "";
	int age = 0;
	int money = 0;
	String myBuyProduct = "";  // 내가 구입한 단 하나의 물건
	
	Customer(String name, int age, int money){
		this.name = name;
		this.age = age;
		this.money = money;
	}
	
	
	
	void info() {
		System.out.println(name+"(" + age+") : " + money+"원 소지");
	}

	@Override
	public String toString() {	//원래는 주소값		
		return "Customer [name=" + name + ", age=" + age + ", money=" + money 
				+ ", myBuyProduct=" + myBuyProduct + "]";
	}
	
	
		
}
