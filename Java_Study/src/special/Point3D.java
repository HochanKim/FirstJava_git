package special;

public class Point3D extends Point {
	int z;	// 변수 z
	
	// 생성자 
	public Point3D(int x, int y, int z) {
		 super(x, y);
		 this.z = z;
	}
	
	void moveUp() {
		z++;
	}
	
	void moveDown() {
		z--;
	}
	
	void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	
	@Override
	// 최상위 Object 클래스가 갖고 있는 toString() 메소드의 오버라이딩 재정의
	public String toString() {
		// (1,2,3) 의 점입니다.
		// (1,2,4) 의 점입니다.
		// (10,10,3) 의 점입니다.
		// (100,200,300) 의 점입니다.
		return "(" + getX() + "," + getY() + ","+ this.z +")의 점";
	}
}
