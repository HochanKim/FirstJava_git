package day07_0625;

public class Person_02 {
	// 공통적 변수
	// 프라이빗 지정
	private String name;	// 이름
	private int age; 		// 나이
	
	Person_02 () {
		System.out.println("Person_02 기본 생성자!");
	}
	
	Person_02 (String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person_02 매개변수 있는 생성자!");
	}

	// 공통적 메소드
	void speak() {
		System.out.println("말한다");
	}
	void eat() {
		System.out.println("먹는다");
	}
	void work() {
		System.out.println("걷는다");
	}
}
