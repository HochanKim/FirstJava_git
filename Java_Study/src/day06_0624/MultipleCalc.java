package day06_0624;
/*
2. 아래 조건에 맞는 클래스 생성하기
	1) 클래스 명 : MultipleCalc
	2) 2개의 정수를 받은 후 곱해서 리턴해주는 메소드 생성
	3) 3개의 정수를 받은 후 곱해서 리턴해주는 메소드 생성
	4) 2,3번의 메소드의 이름은 동일하게 할 것
	5) 2,3번의 메소드는 클래스 이름으로 접근할 수 있도록 선언할 것 => (static 선언)
	6) 메인함수에서 클래스 이름으로 메소드에 직접 접근하여 호출해보기
*/
public class MultipleCalc {
	// 2개의 정수를 받은 후 곱해서 리턴하는 메소드
	public int multiple (int x, int y) {	// 클래스 : MultipleCalc, 메소드 : multiple
		return x*y;
	}
	
	// 3개의 정수를 받은 후 곱해서 리턴하는 메소드
	// 메소드 이름은 동일하게 가능
	public int multiple (int x, int y, int z) {		// 클래스 : MultipleCalc, 메소드 : multiple
		return x*y*z;
	}
}
