package day07_0625;
// 'Point'를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

public class ColorPoint extends Point {
	String color;	// 색깔 (문자열 변수)
	int XY;
	
	// 생성자 작성
	ColorPoint (int x, int y, String color) {	
		super(x, y);	// 부모 클래스 'Point'에서 가져온 '(int x, int y)' 매개변수 가진 생성자
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		System.out.println("("+x+ ", "+y+")");
	}
	public int getXY() {
		return XY;
	}
	
	
	public void setColor(String color) {
		System.out.println(color);
	}
	
//	@override
	// RED색의 (10,20)의 점입니다. 
	public String toString() {
		return this.color+"색의 "+XY+"의 점입니다";
	}

}
