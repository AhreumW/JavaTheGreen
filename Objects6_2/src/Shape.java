
public class Shape {
	
//	점 개수에 따라 다른 도형
	static int pointNum = 3;
//	배열 
	Point[] pointArr = new Point[pointNum];
	
	public Shape(int pointNum) {
		this.pointNum = pointNum;
	}
	
	public Shape(Point[] pointArr) {
		this.pointArr = pointArr;
	}
	
	void info() {
		System.out.println("도형의 정보");
		for(int i =0; i< pointArr.length; i++) {
			System.out.println("x : "+pointArr[i].x+" , y : "+pointArr[i].y);
		}
	}
}
