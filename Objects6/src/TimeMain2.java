
public class TimeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가독성도 높고
		//연관성을 충분히 나타냄
		//객체 지향
		Time koreanTime = new Time();
		Time vietnamTime = new Time();
		
		System.out.println("한국 시간");
		//koreanTime.hour = 17;
		koreanTime.setHour(21);
		System.out.print(koreanTime.hour + " : ");
		koreanTime.minute = 39;
		System.out.print(koreanTime.minute + " : ");
		koreanTime.second = 55;
		System.out.println(koreanTime.second);
		
		System.out.println("베트남 시간");
		vietnamTime.hour = 15;
		System.out.print(vietnamTime.hour + " : ");
		vietnamTime.minute = 39;
		System.out.print(vietnamTime.minute + " : ");
		vietnamTime.second = 55;
		System.out.println(vietnamTime.second);
		
	}

}
