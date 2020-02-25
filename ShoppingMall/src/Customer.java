
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
	
	//개발에서는 잘 안 씀 , 테스트용 -> @Override toString()
	void info() {
		System.out.println(name+"(" + age+") : " + money+"원 소지");
	}

	//toString은 모든 메서드의 맨 마지막에 위치한다. 
	//디버깅용이라 가공X(사용자에게 보일게 아니니까)
	//@ 어노테이션
	@Override
	public String toString() {	//원래는 주소값		
		return "Customer [name=" + name + ", age=" + age + ", money=" + money 
				+ ", myBuyProduct=" + myBuyProduct + "]";
	}
	
	
		
}
