
public class Members {	//클래스		//멤버 = 멤버변수 + 멤버메서드 (다~~~~)

	//이거 다 합쳐서 멤버변수라고 부름(구성원)
	//멤버변수 = 스태틱변수 + 인스턴스변수
	static int number;	//스태틱변수
	static String string;
	int num;			//인스턴스 변수
	String str;
	
	Members(){		//생성자
		
	}
	
	Members(String str){	//생성자
		this.str = str;
	}
	
	//멤버메서드 = 스태틱메서드 + 인스턴스메서드
	static int add(int num) {	//스태틱메서드
		return 0;
	}
	
	static int aaa(int num) {
		return 0;
	}
	
	void add() {	//인스턴스메서드
		
	}
	
	void bbb() {
		
	}
}
