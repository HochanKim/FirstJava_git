package day09_0627;

public class Dog extends Animal {
	// 변수 선언 (필드)
	String breed;	// 품종
	
	// 기본 생성자
	Dog () {
		super("정보없음", 0);	// 상위 클래스의 기본 생성자에 접근
	}
	
	// 생성자
	Dog(String name, int age, String breed) {
		// 객체 변수 초기화
		super(name, age);
		this.breed = breed;
	}
	
	void sound() {	// 메소드 오버라이드(재정의)
		System.out.println("멍멍!");
	}
	
	String getBreed() {
		return this.breed;	// 품종 반환값
	}
}
