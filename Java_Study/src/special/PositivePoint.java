package special;

public class PositivePoint extends Point {
	
	PositivePoint () {
		// 기본 생성자
		super(0, 0);		// 기본 생성자 상속
	}
	
	PositivePoint (int x, int y) {
		super(x, y);
		// 조건식 적용
		if (x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	protected void move(int x, int y) {
		if (x >= 0 && y >= 0) {		// 둘 다 양수라면
			super.move(x, y);		// 상위클래스 메소드 move()를 호출하여 x, y 값을 전달 
		}	// 그렇지 않으면 값을 전달하지 않기
	}
	

	
	@Override
	public String toString() {
		// (10,10)의 점입니다.
		// (10,10)의 점입니다.
		// (0,0)의 점입니다. 
		return "("+ super.getX() +","+ super.getY() +") 의 점";
	}
}
