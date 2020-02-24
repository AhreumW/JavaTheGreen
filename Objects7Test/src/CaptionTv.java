

public class CaptionTv extends Tv{

	boolean captionState = false;   
	String name = "CaptionTv";
	
	
//	void displayCaption(String text) {
//		if(captionState == true) {  // 캡션 상태가 true(켠)일 경우 text를 보여준다 
//			System.out.println(text);
//		}
//	}
	
	void info() {
		System.out.println("==== "+name+" Information ====");
		System.out.println("전원 : " + power);
		System.out.println("볼륨 : " + volume);
		System.out.println("자막여부 : " + captionState);
	}
	
	
}
