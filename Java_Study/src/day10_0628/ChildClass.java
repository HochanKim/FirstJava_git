package day10_0628;

import java.lang.classfile.Superclass;

public class ChildClass extends ParentClass {
	// 필드 선언 (변수)
	private int x;
	private String hello;
	private int y;
	private String apb;
	
	// 생성자 작성 (부모 클래스의 기본 생성자 상속)
	ChildClass () {}
	
	// 메소드 작성
	void gugudan(int x) {
		this.x = x;
		System.out.println("=== "+this.x+"단을 선택했습니다. ===");
		// 6단 출력
		super.gugudan(x); 
	}
	
	// 메소드 작성
//	public void objType(Object obj) {
//		// 다운 캐스팅
//		ChildClass c = (ChildClass) obj;
//		if(c.equals(this.hello)) {
//			
//		}
//	}
}
