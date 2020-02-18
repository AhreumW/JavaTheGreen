
public class TvMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv tv1 = new Tv();	//new하면 새로 할당
		Tv tv2 = new Tv();	//즉, 현재 동일한 TV()형태로 두 개 만듦
		System.out.println("tv1의 channel값은 : "+tv1.channel);
		System.out.println("tv2의 channel값은 : "+tv2.channel);
		
		tv1.channel = 7;
		System.out.println("tv1의 channel값을 7로 변경하였습니다.");
		System.out.println("tv1의 channel값은 : "+tv1.channel);
		System.out.println("tv2의 channel값은 : "+tv2.channel);
	}

}
