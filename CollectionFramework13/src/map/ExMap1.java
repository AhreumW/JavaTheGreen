package map;

import java.util.HashMap;
import java.util.Map;

public class ExMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  key,    value
		Map<String, Integer> map = new HashMap();
		//HashMap을 현업에서 가장 많이 사용한다
		//Map에 대한 가장 기본적인 구현이 HashMap이다
		
		//     <String,  Integer>
		map.put("hello", 52);
		map.put("are you O", 565);
		map.put("are you O", 1111);
		//key는 유일하고 value는 중복이 가능하다
		
		int num = 0;
		
		num = map.get("hello");
		System.out.println(num);
		
		num = map.get("are you O");
		System.out.println(num);
		//동일한 key가 있다면 마지막 결과를 출력한다

	}

}
