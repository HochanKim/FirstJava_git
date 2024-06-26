package day08_0626;
//클래스 상속 복습 (review)
public class ColorPoint extends Point {		// 상위클래스 'Point'의 상속받은 하위클래스 'ColorPoint'
	// 문자열 변수 'color' 선언 (프라이빗 지정 => 직접 접근 불가)
	private String color;
	
	// 생성자 작성
	ColorPoint (int x, int y, String color) {
		// 상위클래스의 생성자 가져오기
		// public Point(int x, int y) {}
		super(x, y);	
		// 클래스 내 변수 접근
		this.color = color;
	}
	
	void setXY(int x, int y) {
		// 상위클래스의 변수가 프라이빗 선언으로 직접 접근 불가
		// this.x = x;
		// this.y = y;
		move(x, y);	// 상위클래스에서 선언한 move()에 메인에서 받은 수를 전달
	}
	
	void setColor(String color) {
		// 같은 클래스이므로 프라이빗 지정 변수에 직접 접근이 가능
		this.color = color;
	}
	
	// 메소드 오버라이딩 @Override : 상위 => 하위로 동일한 메소드를 갖고 하위클래스에서 재정의를 하는 작업
	public String toString() {
		// RED색의 (10,20)의 점입니다. 
		return this.color+"색의 ("+this.getX()+","+this.getY()+")의 점";
		
	}
}
