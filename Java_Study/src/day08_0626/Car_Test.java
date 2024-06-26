package day08_0626;

public class Car_Test {
	// 변수 선언
	String name = "기본차";
	String color = "하얀색";
	int speed;
	
	// 생성자 1
	Car_Test () {
		// 기본 생성자
	}
	
	// 생성자 2
	Car_Test (String name, String color) {
		// (문자열, 문자열) 매개변수 가진 생성자
		this.name = name;
		this.color = color;
	}
	
	// 생성자 3
	Car_Test (String name, String color, int speed) {
		// (문자열, 문자열, 정수) 매개변수 가진 생성자
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 메소드 지정 1
	void carInfo() {
//		자동차 이름은 기본차, 색상은 하얀색 입니다.
//		자동차 이름은 아반떼, 색상은 노란색 입니다.
//		자동차 이름은 소나타, 색상은 파란색 입니다.
		System.out.println("자동차 이름은 "+name+", 색상은 "+color+" 입니다.");
	}
	
	// 메소드 지정 2
	void setInfo(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	
	// 메소드 지정 3
	void speedUp(int speed) {
		this.speed = speed;
	}
	
	// 메소드 지정 4
//	void getSpeed() {
//		this.speed = speed;
//		if (speed > 200) {
//			speed = 200;
//		}
//	}
}
