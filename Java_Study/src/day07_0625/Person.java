package day07_0625;
// 해답 ver
public class Person {
	// 변수 : name(이름), age(나이), phone(핸드폰 번호)
	// 모든 변수는 private로 선언
	private String name;
	private int age;
	private String phone;
	
	// 객체를 생성하면서 이름, 나이를 초기화
	Person(String name, int age) {	// 생성자 작성
		this.name = name;
		this.age = age;
	}
	
	// get, set 메소드 구현
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	// 매개변수로 phone값을 입력받아서 저장하는 메소드 생성
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
