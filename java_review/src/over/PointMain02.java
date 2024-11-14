package over;

public class PointMain02 {

	// [2번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.

	public static void main(String[] args) {
	   ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
	   System.out.println(zeroPoint.toString() + "입니다.");
	   ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
	   cp.setXY(5,5);
	   cp.setColor("RED");
	   System.out.println(cp.toString()+"입니다.");
	}
//	 결과 : BLACK색의 (0,0) 점입니다. / RED색의 (5,5) 점입니다.

}
