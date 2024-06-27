package day08_0626;

public class Car_Test {
	// 변수 선언 (필드)
	String name;
	String color;
	int speed;
	
	// 생성자 1
	Car_Test () {
		// 기본 생성자
		// 'this()'로 다른 생성자 호출
		this("기본차", "하얀색", 0);
		// this.name = "기본차";
		// this.color = "하얀색";
	}
	
	// 생성자 2
	Car_Test (String name, String color, int speed) {
		// (문자열, 문자열, 정수) 매개변수 가진 생성자
		// 선언된 변수들을 초기화
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
	void speedUp(int s) {
		this.speed = this.speed + s;
		// this.speed += s;
		if (this.speed > 200) {
			System.out.println("200 이상의 속도는 불가합니다. 200으로 변경합니다.");
			this.speed = 200;	
		} 
	}
	
	// 메소드 지정 4
	void speedDown(int s) {
		this.speed -= s;
		if (this.speed < 0) {
			System.out.println("0 미만의 속도는 불가합니다. 0으로 변경합니다.");
			this.speed = 0;
		}
	}
	
	// 메소드 지정 5
	int getSpeed() {
		return speed;
	}
}

