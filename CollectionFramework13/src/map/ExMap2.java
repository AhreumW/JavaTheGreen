package map;

import java.util.HashMap;
import java.util.Scanner;

public class ExMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> userMap = new HashMap<String, String>();
		
		userMap.put("admin", "admin12@");
		userMap.put("tg", "theGood");
		userMap.put("seven", "qwer1234");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("id와 password를 입력해주세요");
		System.out.print("id : ");
		String id = scan.nextLine().trim(); //공백 제거
		
		System.out.print("password : ");
		String pwd = scan.nextLine().trim();
		
		//containsKey -> 보유하고 있는 key 중에 있는지
		if(userMap.containsKey(id) == false) {
			System.out.println("입력하신 id는 존재하지 않습니다");
		}else {
			//value를 구할땐 key값을 get하고 그에 맞는 value를 비교한다
			if(userMap.get(id).equals(pwd) == false) {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}else {
				System.out.println("id와 비밀번호가 일치합니다.");
				System.out.println("로그인 되었습니다.");
			}
		}
		

	}

}
