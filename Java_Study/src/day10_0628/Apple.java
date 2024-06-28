package day10_0628;

public class Apple extends Fruit {
	
	Apple (String name, String color, int price) {
		super(name, color, price);
	}
	
	@Override
	// 메소드 오버라이드(재정의)
	void print() {
		// 상위 클래스의 메소드 'print()' 호출
		// 하위클래스에서 오버라이드(재정의)를 하면 재정의한 메소드가 출력된다.
		super.print(); 	// 재정의를 했어도 상위 클래스에서 선언된 구문도 같이 출력할 수 있다.
		System.out.println("사과는 비싸다!");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "사과 클래스";
//		return super.toString();
	}
}
