package byHong;

public class MuteTv extends Tv{
	
	int preVolume; // 이전 볼륨
	// true음소거인 상태, false 음소거 꺼져있는 상태
	boolean noSound = false; // 눌렀는지 여부 
	String mName = "Mute";
	
	MuteTv(){
		
	}
	MuteTv(boolean power, int channel, int volume, boolean noSound){
		this.power = power;
		this.channel = channel;
		this.volume = volume;
		this.noSound = noSound;
	}
	
	void muteTv() {
		if(!noSound) {
			preVolume = volume;
			volume = 0;
			noSound = true;
			System.out.println("음소거가 되었습니다.");
		}else{
			volume = preVolume;
			noSound = false;
			System.out.println("음소거가 풀리고 이전 volume : " 
					+ volume + "로 돌아갑니다.");			
		}
	}
	
	void muteTvInfo() {
		System.out.println("==== "+mName+name+" Information ====");
		System.out.println("전원 : " + power);
		System.out.println("채널 : " + channel);
		System.out.println("이전 볼륨 : " + preVolume);
		System.out.println("볼륨 : " + volume);
		System.out.println("음소거여부 : " + noSound);
	}
	
}