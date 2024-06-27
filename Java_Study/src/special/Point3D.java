package special;

public class Point3D extends Point {
	private int z;	// 변수 z 선언
	
	// 생성자 
	public Point3D(int x, int y, int z) {
		// 선언된 변수 초기화
		 super(x, y);	// 상속받은 변수
		 this.z = z;
	}
	
	void moveUp() {
		this.z++;
	}
	
	void moveDown() {
		this.z--;
	}
	
	void move(int x, int y, int z) {
		super.move(x, y);	// 상위클래스의 메소드 'move()'를 호출
		this.z = z;
	}
	
	
	@Override
	// 최상위 Object 클래스가 갖고 있는 toString() 메소드의 오버라이드(재정의)
	public String toString() {
		// (1,2,3) 의 점입니다.
		// (1,2,4) 의 점입니다.
		// (10,10,3) 의 점입니다.
		// (100,200,300) 의 점입니다.
		return "(" + super.getX() + "," + super.getY() + ","+ this.z +")의 점";
	}
}
