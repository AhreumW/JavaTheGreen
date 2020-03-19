package list.arraylist.casting;

import java.util.ArrayList;

public class ExArrayList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList numTestList = new ArrayList();
		//제너릭스(Generics):
		//		 <Integer = 숫자만> 의미를 명확하게 만들기 위해서 모두 허용보다 이렇게 각 허용을 해준다
		//<클래스>
//		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<Integer> numList = new ArrayList(); //이렇게도 표현 가능. 하지만 노란 경고 뜸(명확히 하란 뜻)
		//현업에선 뒤에 <Integer>를 작성하지 않은 것을 주로 사용
		
		numTestList.add(1);
		numTestList.add(10);
		
		//Integer와 int는 다르다. Integer는 객체이다.
		//옛날 버전에선 아래처럼 객체로 선언해서 사용했어야 했다.
//		Integer number = new Integer(1);
		//래퍼 클래스
//		numList.add(number);
		//auto boxing/unboxing을 통해서 더이상은 위처럼 객체 선언을 안해줘도 자동적으로 바뀐다
		numList.add(1);
		numList.add(10);
		
//		System.out.println(numTestList.get(0) * numTestList.get(1)); //에러!
		System.out.println(numList.get(0) * numList.get(1));

	}

}
