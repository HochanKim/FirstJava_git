package day10_0628;


public class ChildClass extends ParentClass {
	
	// 생성자 작성 (부모 클래스의 기본 생성자 상속)
	ChildClass () {}
	
	
	// 메소드 작성 (ParentClass 클래스의 상속을 받아 오버라이드)
	void gugudan(int x) {
		// 6단 출력
		getNum();	// 상위클래스 변수의 프라이빗 지정으로 간접 접근
		System.out.println("=== "+x+"단을 선택했습니다. ===");
		super.gugudan(x); 
		System.out.println("=== 종료되었습니다. ===");
	}
	
	// 메소드 작성 (변수 타입 구분으로 메소드 오버로딩 후 출력)
	public void objType(String hi) {
		// 문자열 String (클래스 참조형 타입)
		System.out.println("문자열 입니다.");
	}
	
	public void objType(int num) {
		// 정수형 int (정수형 기본 타입)
		System.out.println("정수 입니다.");
	}
	
	public void objType(Object apb) {
		// Object (클래스 참조형 타입)
		System.out.println("문자나 정수가 아닙니다.");
	}
	
	
}
