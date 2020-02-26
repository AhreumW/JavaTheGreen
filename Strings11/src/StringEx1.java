
public class StringEx1 {
	
	public static void main(String[] args) {
		
		Value v1 =new Value(10);
		Value v2 =new Value(10);
		
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		//주소를 확인해보면 둘은 엄연히 다름(다른 객체)
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v1 == v2);
		
		System.out.println(10 == 10);
		System.out.println("as" == "as");
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		//주소가 같아짐
		v2 = v1; 
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
	}

}
