
public class GugudanTest2 {

	public static void main(String[] args) {
		
		Gugudan2 gugudan = new Gugudan2("스마트구구단");
		gugudan.info();
		
		//선생님은 이 통채로 service()메서드로 만듦 : while까지 다~~~!!
		while(gugudan.repeat) {
			gugudan.input();
			gugudan.output();
			gugudan.end();
		}
		
	}
	
	
	
}
