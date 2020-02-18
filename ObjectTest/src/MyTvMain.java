
public class MyTvMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		선언
//		타입 변수명;
		MyTv t;				 
		t = new MyTv();		 
		
		t.color = "빨강";
		t.power = true;
		t.channel = 11;	
		t.inch = 36;
		t.resolution = "4K";
		
		System.out.println("TV 색상은 "+ t.color+"색입니다.");
		System.out.println(t.power);
		System.out.println("현재 채널은 "+ t.channel + "입니다.");
		System.out.println("사이즈는 "+ t.inch+"inch입니다.");
		System.out.println("해상도는 "+ t.resolution+"입니다.");
		
		
	}

}
