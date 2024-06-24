package day06_0624;

public class Human_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("홍길동", 30, "인천", 150000);
		Human kim = new Human("김철수", 32, "서울", 150000);
		Human park = new Human("박영희", 25, "부천", 150000);
		
		hong.age = 40;
		System.out.println(kim.age);
		
		park.money708 = 140000;
		System.out.println(kim.money708);	// static 공유의 특성으로 인해 값이 변화했다
		
		System.out.println(Math.PI);
//		final int num = 10;		// final이 붙은 변수는 수정이 불가능하다
//		num = 20;
		
//		Human.staticName();
	}

}
