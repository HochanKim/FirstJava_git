package day06_0624;

public class Person_Main {

	public static void main(String[] args) {
		// 객체 생성 1
		Person hong = new Person("홍길동", 20);
		
		// 객체 생성 2
//		hong.setName("고길동");	// 이름이 변경됨
//		hong.setAge(30);		// 나이가 변경됨
		hong.setPhone("123-123");
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getPhone());
	}

}
