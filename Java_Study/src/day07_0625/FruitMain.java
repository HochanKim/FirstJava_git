package day07_0625;

public class FruitMain {
	
	static void fruitBox(Fruit f, int num) {
		System.out.println(f.name+"를 "+ num +"개 포장했습니다.");
		if (f instanceof Banana) {
			System.out.println("바나나 전용 박스에 담았습니다.");
		}
		if (f instanceof Orange) {
			System.out.println("오렌지 전용 박스에 담았습니다.");
		}
	}

	public static void main(String[] args) {
		// Banana, Orange, Apple 객체 생성
		Banana banana = new Banana("바나나", "노란색", 2000);
		Orange orange = new Orange("오렌지", "주황색", 1500);
		Apple apple = new Apple("사과", "빨간색", 4500);
		
		fruitBox(banana, 3);
		fruitBox(orange, 4);
		fruitBox(apple, 2);
	}

}
