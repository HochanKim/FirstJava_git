package day07_0625;


public class Day6_Test1 {

	public static void main(String[] args) {
		// 'Person' 클래스에 접근하여 객체(인스턴스) 생성
		Person hong = new Person("홍길동", 20);
		// hong.phone = "123-123"
		hong.setPhone("123-123");
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getPhone());
		
		// 메인함수에서 "MultipleCalc" 클래스 이름으로 메소드에 직접 접근하여 호출해보기
		int a = MultipleCalc.multiple(2, 3);
		int b = MultipleCalc.multiple(3, 4, 5);
		
		System.out.println(a);
		System.out.println(b);
	}

}
