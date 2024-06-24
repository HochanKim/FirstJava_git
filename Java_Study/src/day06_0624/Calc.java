package day06_0624;

/*
3-1. 아래 조건에 맞게 클래스를 작성하시오.
 - 클래스명 : Calc
 - 메소드 : sum, multiple
 - 위 메소드 들은 객체 생성없이 클래스명으로 호출가능하도록
 - 위에서 정의한 메소드는 각각 2개의 정수를 받아서 덧셈, 곱셈 결과를 리턴
 
3-2. 해당 클래스의 multiple 메소드를 아래조건에 맞게 수정하시오.
 - 오버로딩하여 3개의 메소드로 만들기(매개변수 수정은 자유롭게)
3-3. main이 포함된 클래스를 생성하고 main 메소드 내에 아래 조건에 맞게 작성하시오.
 - Calc클래스의 메소드를 호출하시오(sum 1개, multiple 3개) 
*/

public class Calc {

	static int sum(int x, int y) {	// 객체 생성없이 클래스명으로 호출가능하도록 => static 생성
		// 각각 2개의 정수를 받아서 덧셈 결과를 리턴
		return x+y;
	}
	
	static int multiple(int x, int y) {
		// 각각 2개의 정수를 받아서 곱셈 결과를 리턴
		return x*y;
	}
	
	static int multiple(int x, int y, int z) {
		// 오버로딩하여 3개의 메소드로 만들기
		return x*y*z;
	}
	
	static double multiple(double x, int y) {
		// 매개변수 수정은 자유롭게 => int > double
		return x*y;
	}

}
