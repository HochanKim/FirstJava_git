package over;

public class Human {
	// 클래스 'Human'의 필드(선언한 변수)
	String name;
	int age;
	String addr;
	
	// 클래스 'Human'의 생성자
	// 기본 생성자
	public Human() {
		
	}
	
	// 오버로딩한 생성자
	public Human(String name, int age, String addr) {
		// 필드에서 선언한 변수들을 파라미터로 받음 (전부 받을 필요는 없음)
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	
	// 클래스 'Human'의 메소드 
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}
	
}
