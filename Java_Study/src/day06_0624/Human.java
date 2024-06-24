package day06_0624;

public class Human {
	String name;
	int age;
	String addr;
	static int money708;	// static 멤버들은 동일한 클래스의 모든 객체에 의해 공유되어 클래스 접근을 가능하게 한다
	
	// static과 non-static
	static void staticName() {
//		name = "유재석";		// static 함수에서는 static 함수만 접근이 가능하다.
		money708 = 200000;
	}
	
	Human (String name, int age, String addr, int money708) {		// 클래스 'Human'의 생성자
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.money708 = money708;
	}
	void eat(String txt, String food){	// 두 개 이상의 변수를 생성할 수 있다
		System.out.println(txt + "식사로 "+food+"를 먹었다!");
	}
	void study(){
		System.out.println("자바 진짜 재밌다");
	}
}
