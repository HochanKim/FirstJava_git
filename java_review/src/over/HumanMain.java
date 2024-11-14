package over;

public class HumanMain {

	public static void main(String[] args) {
		Human h = new Human("홍길동", 30, "캘리포니아");
		h.info();
		
		System.out.println();
		
		Student stu = new Student("홍길동", 30, "캘리포니아", "12345678");
		stu.info();		// 상속해준 클래스의 메소드 가져오기
//		stu.stuInfo();	// '학번은 12345678 입니다.'
	}
}
