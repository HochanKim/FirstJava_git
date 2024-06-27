package special;

public class PoinMain_04 {

	public static void main(String[] args) {
			// 객체명(레퍼런스 변수명) 'p'
			// 기본 생성자, 생성자 매개변수 : (int, int)
			PositivePoint p = new PositivePoint();
			p.move(10, 10);
			System.out.println(p.toString()+"입니다.");
			p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
			System.out.println(p.toString()+"입니다.");
			
			// 메소드 매개변수 : (int, int), 객체명(레퍼런스 변수명) 'p2'
			PositivePoint p2 = new PositivePoint(-10, -10);
			System.out.println(p2.toString()+"입니다.");

			// 결과값
			// (10,10)의 점입니다.
			// (10,10)의 점입니다.
			// (0,0)의 점입니다. 
		}
}

