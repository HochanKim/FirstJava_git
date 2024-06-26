package day08_0626;
// 클래스 상속 복습 (review)

public class Point {
	// 클래스 'Point'의 변수 지정
	// private 지정으로 직접 접근이 불가
	private int x, y;
	
	// 클래스 'Point'의 생성자
	public Point(int x, int y) { 
		this.x = x; 
		this.y = y; 
	}
	
	// 간접 접근을 통해 받은 x값
	public int getX() { 
		return x; 
	}
	
	// 간접 접근을 통해 받은 y값
	public int getY() { 
		return y; 
	}
	
	// move 메소드
	protected void move(int x, int y) { 
		this.x = x; 
		this.y = y; 
	}
}
