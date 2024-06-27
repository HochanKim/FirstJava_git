package day09_0627;


public class FruitMain {
	static void boxing(Fruit f) {
		// 'Fruit f' => 업캐스팅, 자동 타입 변환
		// 'boxing'에서 Fruit 객체 'f'를 받음
		System.out.println(f.name +"을(를) 포장했습니다.");
	}
	
	public static void main(String[] args) {
		Banana banana = new Banana("바나나", "노란색", 2000);
		Fruit b = banana; // 업캐스팅
		
		Orange orange = new Orange("오렌지", "주황색", 1500);
		Fruit o = orange; // 업캐스팅
		
		Apple apple = new Apple("사과", "빨간색", 4500);
		Fruit a = apple; // 업캐스팅
		
		// Candy candy = new Candy();
		
		boxing(banana);
		boxing(apple);
		boxing(orange);
		// boxing(candy);
	}

}
