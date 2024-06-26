package special;
// 'Point'를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

public class ColorPoint extends Point {
	private String color;	// '색깔' 저장을 위한 문자열 변수
	int XY;
	
	// 생성자 작성
	ColorPoint (int x, int y, String color) {
		// x 좌표, y 좌표, 색깔을 받는 매개변수 작성
		super(x, y);	// 부모 클래스 'Point'에서 가져온 '(int x, int y)' 매개변수 가진 생성자
		this.color = color;		// 변수 'color' 초기화
	}
	
	void setXY(int x, int y) {
//		System.out.println("("+x+ ", "+y+")");	// 오답
		// 부모 클래스의 프라이빗 선언으로 직접 접근이 불가 => ex) this.x = x; (에러)
		move(x, y); 	// 부모 클래스에 있는 move 메소드를 통해 간접 접근
	}
	
//	public int getXY() { // 오답
//		return XY;
//	}
	
	void setColor(String color) {
		// 프라이빗 변수지만 같은 클래스에 속하므로 사용 가능한 this
		this.color = color;
	}
	

	@Override
	// 최상위 Object 클래스가 갖고 있는 toString() 메소드의 오버라이딩 재정의
	public String toString() {
		// RED색의 (10,20)의 점
		return color + "색의 (" + getX() + "," + getY() +")의 점";
	}

}

