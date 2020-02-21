/*
 * 단축키
 * ctrl + . = 문제 발생 지점 찾아가기
 * ctrl + 1 = 문제 발생 영역에 대한 힌트를 알려줌
 * ctrl + shift + r = 자원 찾기->파일찾기 	//특히 show in 버튼 유용
 */
public class Tv {
	
	boolean power;		//전원(on/off)	
	int channel; 		//채널
	int volume;			//볼륨 		

	void power() {
		power = !power;
	}

	void volumeUP() {
		volume++;
	}
	
	void volumeDown() {
		volume--;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	void volumeInfo() {
		System.out.println("tv.volume : "+ volume);
	}
	
}
