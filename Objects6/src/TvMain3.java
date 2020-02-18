
public class TvMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		복제
		Tv tv = new Tv();		//new : 인스턴스화 시킴(객체=인스턴스)
		Tv tv2 = new Tv();		
		 
		tv.channel = 7;	
		tv.power = true;
		tv.color = "red";
		
		System.out.println("========tv1=========");
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		System.out.println("========tv2=========");
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.color);
		
		tv2 = tv;					// 주소값이 복제되어서 나중에 tv1의 정보를 바꾸면 tv2가 함께 바뀜
//		tv2.channel = tv.channel;	// 이처럼 값을 복사해야 복제~!!
		System.out.println();
		System.out.println("복제 성공");
		System.out.println("========tv1=========");
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		System.out.println("========tv2=========");
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.color);
		
		tv2.channel = 1000;
		System.out.println();
		System.out.println("tv2 정보 변경");
		System.out.println("========tv1=========");
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		System.out.println("========tv2=========");
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.color);
	}

}
