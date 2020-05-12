
public class TestForEx1 {

	public static void main(String[] args) {
		
		String[] strArr = new String[10];
		
		for(int i=0; i<strArr.length; i++) {
			strArr[i] = "사람이름" + i;
		}
		
		System.out.println("원래의 for문");
		//같은 결과1
		for(int i=0; i<strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
		System.out.println();
		
		System.out.println("확장된 for문");	// ver1.7부터 나옴
		//같은 결과2
/* 		for(String test : 배열리스트타입) { 	// Iterator기반, 순서 보장
			배열타입이 for문을 돌면서 차례로 String test에 할당시킨다. 
		}	*/
		for(String test : strArr) {		//test변수는 인스턴스변수로서 매번 소멸 생성을 반복한다. 
			System.out.print(test + " ");
		}
		
		
		
		
	}
}
