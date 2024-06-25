package day07_0625;

public class Student extends Person_02 {
	// (상위)클래스 'Person_02'의 상속(extends)을 받는 (하위)클래스 'Student'
	
	String stuNo;		// 학번
	String stuDept;		// 학과
	
	Student() {	// 기본 생성자
		System.out.println("Student의 기본 생성자!");
	}
	
	Student(String name, int age, String stuNo, String stuDept) {	// 객체 'kcs'의 생성자
		// '이름, 나이, 학번, 학과'를 담는 생성자
		super(name, age);	// 부모 클래스에 있는 생성자를 상속
		this.stuNo = stuNo;
		this.stuNo = stuDept;
	}
	
	Student(String name, int age) {
		super(name, age);
		System.out.println("Student의 매개변수 있는 생성자!");
	}
	
	void study() {
		System.out.println("공부한다");
	}
	
}
