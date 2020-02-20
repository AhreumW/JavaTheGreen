
public class Home {
	
	int floor = 0;
	int room = 0;
	boolean terrace = false;
	
	
	Home(int f, int r, boolean te) { 
		floor = f;
		room = r;
		terrace = te;
	}
	
	void homeInfo() {		//출력은 따로~!!
		System.out.println("my home");
 		System.out.println(floor+ "층");
 		System.out.println("방은 "+ room+"개");
 		if(terrace) {
 			System.out.println("테라스 필수");
 		}else {
 			System.out.println("테라스 없지만 방 많음");
 		}
	}
	
}
