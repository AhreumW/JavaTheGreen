import java.util.Scanner;

public class DrawShape2 {

	public static void main(String[] args) {
		
		/*					삼각형만들기					*/
		
		Point[] pointArr = new Point[3];		//클래스도 타입이다.-> 배열이 된다.
		for(int i =0; i< pointArr.length; i++) {
			pointArr[i] = new Point(i+1, i+2);
		}

		Triangle tri = new Triangle(pointArr);
		tri.info();
		
		
		
		/*					다각형만들기					*/
		
		
		//실패
		/*					다각형만들기					*/
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 각형을 만들고 싶습니까? >>");
		Shape.pointNum = scan.nextInt();
				
		Point[] sPointArr = new Point[Shape.pointNum];
				
//				Point r1 = new Point(2,3);
//				Point r2 = new Point(2,10);
//				Point r3 = new Point(5,3);
//				Point r4 = new Point(5,10);
//				
				
		System.out.println("점의 좌표를 x, y 순서대로 입력하시오.");
		for(int i = 0; i<Shape.pointNum; i++) {

			System.out.println("점"+(i+1)+"의 x:");
			sPointArr[i].x = scan.nextInt();
			System.out.println("점"+(i+1)+"의 y:");
			sPointArr[i].y = scan.nextInt();
		}
				
		Shape shape = new Shape(sPointArr);

		shape.info();
	}
}
                                                               