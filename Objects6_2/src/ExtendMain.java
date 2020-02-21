
public class ExtendMain {

	public static void main(String[] args) {

//		Parent p = new Parent();
		Child c = new Child();
		c.age = 33;
		//부모를 생성하지 않아도 c.age를 쓸 수 있다.
		//왜? 이미 설계도 자체가 묵시적으로 만들어놔서!!!!
		
//		System.out.println(p.age);
		System.out.println(c.age);
		c.name = "나";
		System.out.println(c.name);
//		System.out.println(p.name);		//에러 -> 변수가 없음
		
		c.weight = 10;
		System.out.println(c.weight);
		c.play();
		
		Child2 c2 = new Child2();	
		c2.age = 20;
		c2.weight = 100;
		c2.play(); 			//c.play()와 c2.play는 아무런 연관이 X
		
	}

}
