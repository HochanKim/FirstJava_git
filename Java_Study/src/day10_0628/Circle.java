package day10_0628;

/*
 * 
중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하고자 한다. 
생성자는 3개의 인자(x, y, radius)를 받아 해당 필드를 초기화하고, 
equals() 메소드는 두 개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다.

*/

public class Circle {
	// 필드 선언 (변수)
	private int x; 
	private int y; 
	private int radius;
	
	// 생성자 선언 (매개변수 초기화)
	Circle (int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		// 원 a : "Circle(2,3), 반지름 5"
		// 원 b : "Circle(2,3), 반지름 30"
		return "Circle("+this.x+","+this.y+"), 반지름 "+this.radius;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 다운캐스팅 작업
		Circle a = (Circle) obj;
		if (this.x == a.x && this.y == a.y) {
			return true; 	// a.equals(b)
		} else {
			return false;
		}
	}

}
