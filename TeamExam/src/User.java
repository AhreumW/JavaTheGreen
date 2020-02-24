import java.util.Scanner;

public class User {
	
	String name;	//이름
	int position; 	//위치
	
	void input() {	//이름 입력
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();		
	}
	
	void position(int num) {	//유저 위치(누적 값)
		position = position+ num;
	}
	
	
}
