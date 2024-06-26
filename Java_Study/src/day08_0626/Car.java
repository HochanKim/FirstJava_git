package day08_0626;
// review
public class Car {
	String name;	// 종류
	String color;	// 도색
	int speed;		// 속도
	
	// set() : 단순히 실행하고 끝내는 메소드
	void setName() {	// 메소드(함수)
		System.out.println("이름을 넣는 메소드");
	}
	
	// get() : 내가 원하는 값을 되돌려 주는 메소드
	String getName() {	// 메소드(함수)
		return name;
		// 반환값의 데이터 유형과 동일해야 값을 보낼수 있다. 
	}
	
	void speedUp(int s) {
		// 매개변수를 설정하면 값을 받을수 있다. (받는 값과 데이터 타입, 개수가 같아야 한다.)
		speed += s;
		System.out.println(speed);
	}
}
