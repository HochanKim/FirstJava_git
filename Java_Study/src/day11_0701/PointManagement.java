package day11_0701;

public class PointManagement {
	// 필드 영역 (변수 선언)
	private String name;
	private int point;
	
	// 생성자
	PointManagement (String name, int point) {
		this.name = name;
		this.point = point;
	}
	
	// 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPoint() {
		return point;
	}
	
	void pointUp(int point) {
		this.point = 0;
		if (getName().equals(getName())) {
			this.point += this.point;
		}
	}
}
