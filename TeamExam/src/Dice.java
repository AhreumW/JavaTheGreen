
public class Dice {
	
	int num;	//주사위 결과값
	
	int random() {	//주사위 돌리기 
		num = (int)(Math.random() * 6) + 1;
		return num;
	}
	
}
