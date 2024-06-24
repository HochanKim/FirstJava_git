package day06_0624;

public class Person_Main {

	public static void main(String[] args) {
		// 객체 생성 1
		Person hong = new Person("홍길동", 20);
		
		// 객체 생성 2
		hong.getPhone();
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setPhone("123-123");
		
		System.out.println(hong.getPhone());
	}

}
