package day05_0621;

public class Human {
	String name;
	int age;
	String addr;
	
	Human (String name, int age, String addr) {		// 클래스 'Human'의 생성자
		this.name = name;
		this.age = age;
		this.addr = addr;
		System.out.println("이름 : "+name+ "\n나이 : "+age+"\n주소 : "+addr);
	}
	
	void eat(String txt, String food){	// 두 개 이상의 변수를 생성할 수 있다
		System.out.println(txt + "식사로 "+food+"를 먹었다!");
	}
	void study(){
		System.out.println("자바 진짜 재밌다");
	}
}
