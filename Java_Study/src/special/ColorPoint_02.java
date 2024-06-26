package special;

public class ColorPoint_02 extends Point {
	private String color;	// '색깔' 저장을 위한 문자열 변수
	
	// 기본생성자
	ColorPoint_02 () {
		this(0, 0, "BLACK");	// super(0, 0);  this.color = "BLACK"; 과 동일
		// 같은 생성자를 가져와서 사용
		// 중복 코드 작성 방지, 간결성
	}
	
	// 생성자 작성
	ColorPoint_02 (int x, int y, String color) {
		// x 좌표, y 좌표, 색깔을 받는 매개변수 작성
		super(x, y);	// 부모 클래스 'Point'에서 가져온 '(int x, int y)' 매개변수 가진 생성자
		this.color = color;		// 변수 'color' 초기화
	}
	
	void setXY(int x, int y) {
//		System.out.println("("+x+ ", "+y+")");
		// 부모 클래스의 프라이빗 선언으로 직접 접근이 불가 => ex) this.x = x; (에러)
		move(x, y); 	// 부모 클래스에 있는 move 메소드를 통해 간접 접근
	}
	
//	public int getXY() {
//		return XY;
//	}
	
	void setColor(String color) {
		// 프라이빗 변수지만 같은 클래스에 속하므로 사용 가능한 this
		this.color = color;
	}
	public ColorPoint_02(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	// 최상위 Object 클래스가 갖고 있는 toString() 메소드의 오버라이딩 재정의
	public String toString() {
		// RED색의 (10,20)의 점
		return color + "색의 (" + getX() + "," + getY() +")의 점";
	}

}
