import java.util.Scanner;

public class DrawShape {

	public static void main(String[] args) {
		
		/*					원 만들기					*/
		Circle circle = new Circle();
		circle.r = 5;
		Point p = new Point();
		
		//Point point = null;일때 (new안함)
		//nullPointException 뜸
//		circle.point.x = 2;
//		circle.point.y = 3;		//+ 또 관리도 복잡함
		
		p.x = 2;
		p.y = 3;
		
		circle.point = p;	//분리, 모듈화
		circle.info();
		
		
		/*					삼각형만들기					*/
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,10);
		Point p3 = new Point(5,7);
		
//		Point[] pointArr = new Point[3];		//클래스도 타입이다.-> 배열이 된다.
//		pointArr[0] = p1;
//		pointArr[1] = p2;
//		pointArr[2] = p3;
		
//		Triangle tri = new Triangle(pointArr);
		Triangle tri = new Triangle(p1,p2,p3);
		tri.info();
		
		
		/*					사각형만들기					*/
		Point r1 = new Point(2,3);
		Point r2 = new Point(2,10);
		Point r3 = new Point(5,3);
		Point r4 = new Point(5,10);
		
//		Point[] pointArr2 = new Point[4];
//		pointArr2[0] = r1;
//		pointArr2[1] = r2;
//		pointArr2[2] = r3;
//		pointArr2[3] = r4;
//		
//		Rectangle rec = new Rectangle(pointArr2);
		Rectangle rec = new Rectangle(r1,r2,r3,r4);
		rec.info();
		
		
		
		
		
	}
}
