package map;

import java.util.HashMap;
import java.util.Map;

public class TestMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		나에게서 가장 먼 친구 3명의 이름을 적고 별명을 지어주세요
//		과장님, 정의광
//		별명으로 이름을 출력한다
		Map<String, String> map = new HashMap();
		
		map.put("칭따오", "이정주");
		map.put("조용한", "박지훈");
		map.put("가수", "정의광");
		
		String nickname = "";
		
		nickname = map.get("칭따오");
		System.out.println(nickname);
		
		nickname = map.get("조용한");
		System.out.println(nickname);
		
		nickname = map.get("가수");
		System.out.println(nickname);

	}

}
