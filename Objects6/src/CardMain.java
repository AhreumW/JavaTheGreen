
public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
//		객체 or 인스턴스
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.num = 7;
		
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.num = 4;
		
		System.out.println("card1은 "+ card1.kind + ", "+ card1.num + "이며, "
				+ "크기는 "+ card1.width + "*"+ card1.height);
		System.out.println("card2은 "+ card2.kind + ", "+ card2.num + "이며, "
				+ "크기는 "+ card2.width + "*"+ card2.height);
		
		System.out.println();
		System.out.println("card1의 width와 height를 50, 80으로 변경해본다.");
		card1.width = 50;
		card1.height = 80;
		
		// 클래스 변수는 인스턴스를 생성하지 않고도 언제라도 바로 사용할 수 있다
		//'클래스이름.클래스변수'
		//Card.width = 70; 
		
		System.out.println("card1은 "+ card1.kind + ", "+ card1.num + "이며, "
				+ "크기는 "+ card1.width + "*"+ card1.height);
		System.out.println("card2은 "+ card2.kind + ", "+ card2.num + "이며, "
				+ "크기는 "+ card2.width + "*"+ card2.height);
	}

}
