
public class TvMain {

	//무조건* 메인 함수가 먼저 실행 (시작점)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t;				// t에 null값의 공간이 생김 
		t = new Tv();		// t에 new(주소)가 할당됨 && Tv(변수 기본값)가 생성 
		/*
			t				0*1000  color[	null	]
			[0*1000]				power[	false	]
									channel[	0	]
		*/
		t.channel = 7;		// t에서 0*1000주소 찾아가 Tv의 channel에 7 할당.
//		t.channelDown();
		System.out.println("현재 채널은 "+ t.channel + "입니다.");
	}

}
