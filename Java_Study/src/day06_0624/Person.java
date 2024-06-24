package day06_0624;
/*
 1. 아래 조건에 맞는 클래스 생성하기
	1) 클래스 명 : Person
	2) 변수 : name(이름), age(나이), phone(핸드폰 번호)
	3) 객체를 생성하면서 이름, 나이를 초기화
	4) 모든 변수는 private로 선언하며 get, set 메소드 구현
	5) 매개변수로 phone값을 입력받아서 저장하는 메소드 생성
	6) 이름 : 홍길동, 나이 20, 핸드폰번호 123-123 값을 가지는 객체 생성
*/

public class Person {
	// 클래스 변수 선언 (private으로 선언)
	private String name;	// 이름
	private int age;		// 나이
	private String phone;	// 휴대폰 번호(앞에 0이 나오는 수가 발생할수 있어 정수형 int 아닌 String으로 설정)
	
	// 생성자 작성
	Person (String name, int age) {
		// 이름, 나이 초기화
		this.name = name;
		this.age = age;
	}
	
	// 프라이빗 접근제어자로 인한 간접 제어 접근
	// get, set 메소드 구현
	public String getName() {
		return name;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge (int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
}
