package byHong;

public class Tv {
//	속성 - 크기, 길이, 색상, 볼륨, 채널 등
//	기능 - 켜기, 끄기, 볼륨 높이기, 볼륨 낮추기, 채널 변경하기 등
	
	boolean power; //전원 ( on/off )
	int channel;	//채널 ( 숫짜아~ )
	int volume;
	String name = "Tv";
	
	Tv(){
		
	}
	Tv(boolean power, int channel, int volume){
		this.power = power;
		this.channel = channel;
		this.volume = volume;
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void soundUp() {
		volume++;
	}
	
	void soundDown() {
		volume--;
	}
	
	//나의 멤버변수 모두 출력 
	void tvInfo() {
		System.out.println("==== "+name+" Information ====");
		System.out.println("전원 : " + power);
		System.out.println("채널 : " + channel);
		System.out.println("볼륨 : " + volume);
		
	}
	
}