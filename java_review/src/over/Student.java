package over;

public class Student extends Human {
	// 클래스 'Student'의 필드
	// default 접근지정자 : private
	String stuNum;	
	
	// 클래스 'Student'의 생성자
	public Student(String name, int age, String addr, String stuNum) {
		super(name, age, addr);		// 부모 클래스를 상속하는 명령어 'super()'
		this.stuNum = stuNum;
	}
	
	// 클래스 'Student'의 메소드
	public void stuInfo() {
		System.out.println("학번은 "+stuNum+" 입니다.");
	}
	
	// 부모클래스의 메소드 재정의 (오버라이드)
	@Override
	public void info(){
		System.out.println("학번은 "+stuNum+" 입니다.");
		super.info();
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("주소 : " + addr);
	}
}
