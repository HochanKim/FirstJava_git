package day08_0626;

public class Point3D extends Point {
	// 변수 선언
	// 상위클래스처럼 private 지정으로 직접 접근이 불가
	private int z;
	
	// 생성자 작성
	public Point3D(int x, int y, int z) {
		super(x, y);	// 상위클래스 'Point'의 생성자 가져오기
		this.z = z;
	}
	
	// 값을 받을 메소드 작성 (1)
	void moveUp() {
		// z 축으로 위쪽 이동
		z++;
	}
	
	// 값을 받을 메소드 작성 (2)
	void moveDown() {
		// z 축으로 아래쪽 이동
		z--;
	}
	// 값을 받을 메소드 작성 (3)
	void move(int x, int y, int z) {
		// x, y, z축으로 이동
		move(x, y);		// 상위클래스의 메소드 상속
		this.z = z;
	}
	
	@Override
	public String toString() {
		// 'x'와 'y'는 직접 접근이 불가하여 간접 접근 메소드를 통해 값을 호출
		// 'z'는 private으로 지정했지만 해당 클래스에서 선언된 값이라 'this'로 호출 가능
		return "("+getX()+","+getY()+","+this.z+") 의 점";
	}
}
