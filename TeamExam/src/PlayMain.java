
public class PlayMain {

	public static void main(String[] args) {
		
		Dice dice = new Dice();
		User user1 = new User();	//유저1
		User user2 = new User();	//유저2
		
		System.out.println("2인 주사위 게임을 시작합니다.");
		System.out.println("유저 1의 이름을 입력해주세요.");
		user1.input();
		System.out.println("유저 2의 이름을 입력해주세요.");
		user2.input();
		
		
		System.out.println("게임을 시작합니다.");
		
		while(user1.position < 10 && user2.position < 10) {
			
			System.out.println(user1.name+"의 주사위를 돌려주세요.");
			int num1 = dice.random();
			System.out.println(num1+"이 나왔습니다.");
			user1.position(num1);
			
			if(user1.position >= 10) {
				System.out.println(user1.name+"가 먼저 10칸에 도착했습니다.");
				//break;
			}
			
			System.out.println(user2.name+"의 주사위를 돌려주세요.");
			int num2 = dice.random();
			System.out.println(num2+"이 나왔습니다.");
			user2.position(num2);
			
			System.out.println("=================================");
			System.out.println(user1.name +"의 위치는 "+user1.position+", "
					+ user2.name +"의 위치는 "+user2.position);
			System.out.println("=================================");
			
			if(user2.position >= 10) {
				System.out.println(user2.name+"가 먼저 10칸에 도착했습니다.");
				//break;
			}
			
		}
		
	}
}
