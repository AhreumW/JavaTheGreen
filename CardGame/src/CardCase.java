/**
 * 
 * @author TJ
 * 카드 52장의 덱
 */
public class CardCase {
	
	int numOfCards = Card.shapeArr.length * Card.numberArr.length;
	
	Card[] cardArr = new Card[numOfCards];
	
	//52장을 만든다.
	public CardCase() {		//보통은 생성자에 작성하지않고 메서드로 따로 만든다~!!!
		int totalCnt = 0;
		
		for (int i = 0; i < Card.shapeArr.length; i++) {
			for (int n = 0; n < Card.numberArr.length; n++) {
				cardArr[totalCnt++] = new Card(i,n);
			}
		}//전체 for문 종료
	}
	
	//카드 하나 선택한다.
	Card pick(int index) {
		return cardArr[index];
	}
	//카드를 랜덤으로 하나 선택한다.
	Card pick() {
		int index = 0;
		index = (int)(Math.random() * numOfCards);
		return cardArr[index];
	}
	
	
	//카드 섞기
	void shuffle() {
		int rand = 0;
		Card tempCard = null;
		
		for (int i = 0; i < cardArr.length; i++) {
			rand = (int)(Math.random() * numOfCards);
			
			tempCard = cardArr[0]; 
			cardArr[0] = cardArr[rand];
			cardArr[rand] = tempCard;
		}
	}
	
	//전체 카드 보기 
	void cardCaseInSide() {
		for (int i = 0; i < numOfCards; i++) {
			String myCard = "";
			myCard = cardArr[i].getCard();
			
			System.out.print(myCard + " ");
			if((i+1) % Card.numberArr.length == 0) {
				System.out.println();
			}
		}
	}
	
	
	
	

}
