package day10_0628;

public class MyPoint {
	// 필드 선언
	private int x;
	private int y;
	
	// 생성자 선언
	MyPoint (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 문자열 리턴 (객체 p)
	public String toString() {
		// Point(3,50)
		return "Point("+this.x+","+this.y+")";
	}
	
	// Object 클래스 오버라이드 및 다운캐스팅
	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		if (this.x == p.x && this.y == p.y) {
			return true;	// p.equals(q) 리턴
		} else {
			return false;
		}
	}
}
