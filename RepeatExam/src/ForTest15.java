import java.util.Scanner;

/**
 * @author TJ
 * 주제 : 1과 100사이의 숫자 중 정답맞추기
 * forTest13 연장
 * 정답을 맞춘 후에 
 * 사용자가 재시도 여부를 정할수 있게 (재도전 y 종료 n)
 * boolean check변수 없애고 break 사용
 */
public class ForTest15 {
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int userSelectNum = 0;
		int answer = 0;
		String user = "";	//유저 시도 여부 
		boolean reRandom = true;	//숫자 다시 랜덤시키기
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {	//랜덤숫자 돌리기
		answer = (int)(Math.random() * 100) + 1; 			//행동이 먼저
		System.out.println("상대방이 숫자를 선택했습니다.");		//출력이 나중
		System.out.println("1~100 사이니 맞춰보세요.");
		
			while(true) {	//시도여부 
				System.out.println(answer);			//정답 엿보기
				System.out.print("1과 100사이의 정수를 입력하세요.>> \t ");
				userSelectNum = scan.nextInt();
				
				if(userSelectNum > answer) {
					System.out.println("더 작은 수로 다시 시도해주세요.");
				}else if(userSelectNum < answer) {
					System.out.println("더 큰 수로 다시 시도해주세요.");
				}else if(userSelectNum == answer) {
					System.out.println("와우 정답입니다.");
					
					System.out.println("재시도 하시겠습니까?(재도전: y, 종료: n)");
					scan.nextLine();			//숫자를 입력하면서 엔터값이 들어오는 것을 비우는 작업**
					user = scan.nextLine();
					
					if(user.equals("y")) {
						break;
					}else if(user.equals("n")) {
						System.out.println("게임이 종료됩니다.");
						reRandom = false;
						break;			//break를 사용하면 체크변수 하나를 덜 쓸 수 있음
					}else {
						System.out.println("잘못입력하셨습니다. 자동 종료됩니다.");
						reRandom = false;
						break;
					}
						
				}
			}
			if(reRandom == false) {
				break;
			}
			
		}
		
		
		
		
		
		
	}

}
