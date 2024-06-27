package day09_0627;

public class Animal {
	// 변수 선언 (필드)
	String name;	// 이름
	int age;		// 나이
	
	// 생성자
	Animal (String name, int age) {
		// 객체 변수 초기화
		this.name = name;
		this.age = age;
	}
	
	void info() {
		// 이름 : 동물, 나이: 5
		System.out.println("이름 : "+ this.name +", 나이 : "+ this.age);
	}
	
	void sound() {
		// 동물이 소리를 냅니다.
		System.out.println(this.name +"이(가) 소리를 냅니다.");
	}
}
