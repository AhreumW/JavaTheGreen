
public class CardCasePlay {

	public static void main(String[] args) {

		CardCase cardCase = new CardCase();
		
		Card rndCard = cardCase.pick();			//랜덤으로 
		System.out.println(rndCard.getCard());	//한 장 선택
		
		cardCase.shuffle();			//카드섞기
		cardCase.cardCaseInSide();	//카드 덱 전체  
		
		Card card = cardCase.pick(0);		// 0 ~ 51
		System.out.println(card.getCard());	//한 장 선택
		
	}

}
