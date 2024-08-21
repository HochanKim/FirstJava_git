package collection01;

public class Human {
	// 필드 영역 (변수 선언)
	private String name;	// 이름
	private int age;		// 나이
	private String addr;	// 주소
	
	// 생성자
	Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
	}

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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}
