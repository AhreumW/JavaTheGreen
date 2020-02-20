
public class ConstructorData2 {
	
	int value = 0;
	
	ConstructorData2() {

	}
	
	//생성자 하나라도 만들면 기본생성자는 생성되지 않음
	ConstructorData2(int num) {				//오버로딩
		value = num;
	}
	
	

}
