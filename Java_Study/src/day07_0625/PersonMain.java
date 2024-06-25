package day07_0625;

public class PersonMain {

	public static void main(String[] args) {
		// 클래스 'Student'에 접근하여 객체(인스턴스) 'hong' 생성
		Student hong = new Student("홍길동", 30);
		
		// Q. '김철수'라는 학생 객체를 생성
		// 이름, 나이, 학번, 학과를 모두 초기화 (변수에 값을 담기)
		Student kcs = new Student("김철수", 24, "2020304-153477", "컴퓨터공학");
		
		
		// 상속으로 인해 상위클래스 'Person_02'의 기능도 사용 가능하다.
//		hong.eat();
//		hong.speak();
//		hong.work();
		
//		Person_02 p = new Person_02();
//		p.study();	// 상위클래스(부모클래스)는 하위클래스(자식클래스)에서만 갖고있는 메소드는 호출할 수 없다.
	}

}
