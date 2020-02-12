/**
 * 
 * @author TJ
 * 주사위 전진 프로그램
 */
public class FlowTest7 {

	public static void main(String[] args) {
		

		int cubeNum = (int)(Math.random() * 6) + 1;	
		
		
		// if문보다 빨라서 종종 쓰임
		switch (cubeNum){
			case 1:
				System.out.println("1칸 전진");
				break;
			case 2:
				System.out.println("2칸 전진");
				break;
			case 3:
				System.out.println("3칸 전진");
				break;
			case 4:
				System.out.println("4칸 전진");
				break;
			case 5:
				System.out.println("5칸 전진");
				break;
			case 6:
				System.out.println("6칸 전진");
				break;
			default:						//절대 나오지 않을 예외상황에도 default는 꼭 대비해서 쓴다.(현업에서도) 
				System.out.println("주사위를 잃어버리셨나봐요");
				break;
		}
		
		
	}

}
