package over;

public class ColorPoint extends Point {
	// 필드
	private String color;
	
	// 기본 생성자
	public ColorPoint() {
		super(0, 0);
		this.color = "BLACK";
	}
	
	// 일반 생성자
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	public ColorPoint(int x, int y) {
		
	}
	
	// 메소드
	public void setXY(int x, int y) {
		// 메소드 move(int x, int y)를 통해 초기화
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	};
	
	public String toString() {
		return this.color + "색의 ("+ getX() + ", "+ getY() +")의 점";
	}
}
