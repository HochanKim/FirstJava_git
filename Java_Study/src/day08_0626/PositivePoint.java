package day08_0626;

public class PositivePoint extends Point {
	
	PositivePoint () {
		// this()로 다른 생성자 호출
		this(0, 0);
	}
	
	PositivePoint (int x, int y) {
		// 생성자 작성 (기본 생성자가 사라짐)
		super(x, y);
	}
	
	void move() {
		this.getX();
		this.getY();
		if (getX() <= 0) {
			Math.abs(getX());
		}
	}
	

	
	@Override
	public String toString() {
		// (10,10)의 점입니다.
		// (10,10)의 점입니다.
		// (0,0)의 점입니다. 
//		return "("+ Math.abs(getX()) +","+ Math.abs(getY())+") 의 점";
//		return "("+ getX() +","+ getY()+") 의 점";
		return "("+ getX() +","+ getY() +") 의 점";
	}
}
