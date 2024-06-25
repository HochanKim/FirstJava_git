package day07_0625;
// 해답 ver
public class MultipleCalc {
	// 2개의 정수를 받은 후 곱해서 리턴해주는 메소드 생성
	// 2,3번의 메소드는 클래스 이름으로 접근할 수 있도록 선언할 것 (static 선언)
	static int multiple (int x, int y) {
		return x*y;
	}
	
	// 3개의 정수를 받은 후 곱해서 리턴해주는 메소드 생성
	// 2,3번의 메소드는 클래스 이름으로 접근할 수 있도록 선언할 것 (static 선언)
	static int multiple (int x, int y, int z) {
		return x*y*z;
	}
}
