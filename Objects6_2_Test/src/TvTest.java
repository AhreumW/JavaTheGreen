/**
 * 
 * @author TJ
 * Tv는 볼륨이 있다. 
 * tv는 볼륨을 1올리고 1내리는 기능이 있다. 
 * 음소거 tv를 만든다. 
 * 음소거가 있다. 
 * 음소거 버튼을 누르면 음소거가 된다. 
 * 음소거가 된 상태에서 다시 음서거 버튼을 누르면 이전의 볼륨 상태로 돌아간다. 
 * 
 */
public class TvTest {

	public static void main(String[] args) {

//		MuteTv tv = new MuteTv();
//		tv.volume = 10;
//		tv.preVol = tv.volume;
		
		MuteTv tv = new MuteTv(10);
		
		tv.volumeInfo();
		
		tv.volumeUP();
		tv.volumeInfo();
		
		tv.volumeDown();
		tv.volumeInfo();
		
		//다른 친구는 파라미터를 안받고 playMute 될때마다 
		//mute도 자동 false/true 됨
		tv.mute = true;
		tv.playMute(tv.mute);
		tv.volumeInfo();
		
		tv.mute = false;
		tv.playMute(tv.mute);
		tv.volumeInfo();
		
		tv.mute = true;
		tv.playMute(tv.mute);
		tv.volumeInfo();
		
		tv.mute = false;
		tv.playMute(tv.mute);
		tv.volumeInfo();
		
		
	}

}
