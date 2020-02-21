
public class Rectangle {
		
//	점이 4개 있으면 사각형이다. 
//	배열 
	Point[] pointArr = new Point[4];
	
	public Rectangle(Point[] pointArr) {
		this.pointArr = pointArr;
	}
	
	public Rectangle(Point p1, Point p2, Point p3, Point p4) {
		pointArr[0] = p1;
		pointArr[1] = p2;
		pointArr[2] = p3;
		pointArr[3] = p4;
	}
	
	void info() {
		System.out.println("Rectangle의 정보");
		for(int i =0; i< pointArr.length; i++) {
			System.out.println("x : "+pointArr[i].x+" , y : "+pointArr[i].y);
		}
	}
	

}
