
public class CardPlay {

	public static void main(String[] args) {
		
		String str = "";
		Card card = new Card();
		
		card.init(0,0);
		
		str = card.getCard();
		System.out.println(str);
	}
	
}
