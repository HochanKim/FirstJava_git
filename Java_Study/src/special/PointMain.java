package special;



public class PointMain {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");		// 객체 생성
		cp.setXY(10, 20);	// return이 없고 호출만 하는 구문
		cp.setColor("RED");
		String str = cp.toString();			// 최상위 Object 클래스가 갖고 있는 toString() 메소드
		System.out.println(str+"입니다.");	// 'str'에 'RED색의 (10,20)의 점' 담기
	}

}
