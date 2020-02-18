
public class MyTvMain2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		MyTv2 tv;
		tv = new MyTv2();		 	//new : 주소 할당
		System.out.println(tv);		//주소값
*/		
		MyTv2 tv = new MyTv2();		//바로 초기화하기를 추천
		MyTv2 tv2 = new MyTv2();		 

		tv.channel = 7;	
		tv.power = true;
		tv.color = "red";
		System.out.println("========tv1=========");
		System.out.println(tv.channel);
		System.out.println(tv.power);
		System.out.println(tv.color);
		
		System.out.println("========tv2=========");
		tv2.channel = tv.channel;	
		tv2.power = tv.power;
		tv2.color = "darkGreen";
		System.out.println(tv2.channel);
		System.out.println(tv2.power);
		System.out.println(tv2.color);
		
	}

}
