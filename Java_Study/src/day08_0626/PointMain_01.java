package day08_0626;
//클래스 상속 복습 (review)

public class PointMain_01 {
	// Point > ColorPoint 클래스의 메인 함수
	public static void main(String[] args) {
		// 클래스 'ColorPoint'에 접근한 객체 생성 (객체명 'cp1')
		ColorPoint cp1 = new ColorPoint(5, 5, "YELLOW");		// 생성자 매개변수 : (int, int, String)
		cp1.setXY(10, 20);	// 클래스 접근 및 전달 1
		cp1.setColor("RED");	// 클래스 접근 및 전달 2
		String str = cp1.toString();			// 클래스에 접근하여 출력문 호출받기
		// 호출받은 출력문 내보내기
		System.out.println(str+"입니다. ");		//	결과 : RED색의 (10,20)의 점입니다. 
		System.out.println();
	}
}
