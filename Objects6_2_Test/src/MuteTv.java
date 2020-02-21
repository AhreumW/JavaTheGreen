
public class MuteTv extends Tv{
	
	//인스턴스 변수, 메서드는 주석을 달아 사용목적 명시
	boolean mute = false;	//음소거 여부
	int preVol = 0;			//이전 볼륨
	
	MuteTv(){
		
	}
	
	MuteTv(int vol){	
		volume = vol;
		preVol = volume;
	}
	
	//다른 친구는 파라미터를 안받고 playMute 될때마다 
	//mute도 자동 false/true 됨
	void playMute(boolean button) {
		mute = button;
		if(mute == true) {	//캡션 상태가 true(켠)일 경우 text를 보여준다. 
			preVol = volume;
			volume = 0;
			System.out.println("음소거 켜졌습니다.");
		}else {
			volume = preVol;
			System.out.println("음소거가 풀립니다. 볼륨 "+volume+"으로 돌아갑니다.");
		}
	}
	
	
	
}
