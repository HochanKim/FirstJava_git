package day10_0628;

public class FruitMain {

	public static void main(String[] args) {
		// 객체 생성
		Apple apple1 = new Apple("사과", "빨간색", 3500);
		Apple apple2 = new Apple("사과", "빨간색", 3500);
		
		Banana banana = new Banana("바나나", "노란색", 2500);
		
		// 메소드 호출
//		apple.print();
//		banana.print();
		
		
		
		System.out.println(apple1 == apple2);	// false, 객체로써 독립적인 존재라 같지 않다
	}

}
