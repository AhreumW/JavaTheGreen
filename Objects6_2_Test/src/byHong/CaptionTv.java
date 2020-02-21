package byHong;

public class CaptionTv extends Tv{

	boolean caption = true;  // 캡션 상태
	String cName = "Caption";
	
	CaptionTv() {
		
	}
	
	CaptionTv(boolean power, int channel, int volume, boolean caption) {
		this.power = power;
		this.channel = channel;
		this.volume = volume;
		this.caption = caption;
	}
	
	void displayCaption(String text) {
		if(caption == true) {  // 캡션 상태가 true(켠)일 경우 text를 보여준다 
			System.out.println(text);
		}
	}
	
	void captionTvInfo() {
		System.out.println("==== "+cName+name+" Information ====");
		System.out.println("전원 : " + power);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		System.out.println("자막여부 : " + caption);
	}
	
}
