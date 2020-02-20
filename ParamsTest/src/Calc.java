
public class Calc {
	/*더하기*/
	///////////////////////
	/*
	int sum(int a, int b)를 주석처리하고 
	int n, int n2를 넣어 돌렸을 때 
	자동형변환*이 일어나면서 int n, double n2로 들어가서
	double sum(int a, double b)로 돌아가 출력됨
	그러나 double sum(int a, double b), double sum(double a, int b) 둘 다 적으면 
	뭘 바꿀지 타입변환에 혼란이 와서 에러가 뜬다. 
	
	-> 이런경우는 혼란때매 보통 출력할타입중 큰 변수타입으로 사용하는데
	동일한 함수를 시행하는데 변수 개수가 다를 때 등 오버로딩을 사용할 수 있다. 
	*/
	////////////////////////
	int sum(int a, int b) {
		System.out.println("int add(int num1, int num2)");
		return a+b;
	}
	
	double sum(int a, double b) {
		System.out.println("double add(int num1, double num2)");
		return a+b;
	}
	
	double sum(double a, int b) {
		System.out.println("double add(double num1, int num2)");
		return a+b;
	}
	
	double sum(double a, double b) {
		System.out.println("double add(double num1, double num2)");
		return a+b;
	}
	///////////////////////////////
	long sum(int a, long b) {
		System.out.println("long sum(int a, long b)");
		return a+b;
	}
	
	long sum(long a, int b) {
		System.out.println("long sum(long a, int b)");
		return a+b;
	}
	
	long sum(long a, long b) {
		System.out.println("long sum(long a, long b)");
		return a+b;
	}
	
	double sum(double a, long b) {
		System.out.println("double sum(double a, long b)");
		return a+b;
	}
	
	double sum(long a, double b) {
		System.out.println("double sum(long a, double b)");
		return a+b;
	}
	///////////////////////////////
	
	/*나누기*/
	///////////////////////////////
	int div(int a, int b) {
		return a/b;
	}
	
	double div(int a, double b) {
		return a/b;
	}
	
	double div(double a, int b) {
		return a/b;
	}
	
	double div(double a, double b) {
		return a/b;
	}
	/////////////////////////////////
	long div(int a, long b) {
		return a/b;
	}
	
	long div(long a, int b) {
		return a/b;
	}
	
	long div(long a, long b) {
		return a/b;
	}
	
	double div(double a, long b) {
		return a/b;
	}
	
	double div(long a, double b) {
		return a/b;
	}
}
