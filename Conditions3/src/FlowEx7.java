
public class FlowEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		표현식
//		switch (key){
//		case value:
//			break;
//		default:			
//			break;
//		}
//		
		int score = (int)(Math.random() * 10) + 1;		
		score = score * 100;
		
		// if문보다 빨라서 종종 쓰임
		switch (score){
			case 100:
				System.out.println("당신의 점수는 100이고, 상품은 자전거입니다.");
				break;
			case 200:
				System.out.println("당신의 점수는 200이고, 상품은 노트북입니다.");
				break;
			case 300:
				System.out.println("당신의 점수는 300이고, 상품은 자동차입니다.");
				break;
			default:
				System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다.");
				break;
		}
		
		
		
		
		
	}

}
