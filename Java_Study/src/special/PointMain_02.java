package special;

public class PointMain_02 {
	// 결과 : BLACK색의 (0,0) 점입니다.
	//		 RED색의 (5,5) 점입니다.
	public static void main(String[] args) {
		ColorPoint_02 zeroPoint = new ColorPoint_02(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint_02 cp = new ColorPoint_02(10, 10); // (10,10) 위치의 BLACK 색 점
		cp.setXY(5,5);
		cp.setColor("RED");
		System.out.println(cp.toString()+"입니다.");
	}

}
