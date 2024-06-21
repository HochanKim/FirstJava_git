package day05_0621;

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천");
		// 클래스 'Human'에 접근하여 객체를 생성, 객체의 레퍼런스 변수 'hong' 설정
//		hong.name = "홍길동";		// 점(.) 연산자를 이용하여 객체 멤버 접근
		System.out.println(hong.name);
		hong.eat("아침", "김치찌개");	// 클래스 'Human'에 있는 메소드 eat()의 String 변수 'txt'에 전달
		hong.study();
		
		System.out.println();
		Human Yoo = new Human("유재석", 40, "서울");
		System.out.println(Yoo.name);
	}
}
