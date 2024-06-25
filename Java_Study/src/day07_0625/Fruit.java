package day07_0625;
/*
1. 클래스 생성 (모든 변수는 private)
 1) 클래스명 : Fruit, 필드 : name(과일명), color, price
	생성자 : 3개의 필드 값 모드 초기화
	메소드 : getPrice 호출 시 'name은 price원 입니다' 출력 (ex, 바나나는 1000원 입니다.)
	=> 'void 메소드()'
	
 2) 클래스명 : Banana, Orange, Apple 클래스 생성 및 Fruit클래스 상속받기
	(필드 및 메소드는 구현안해도 됨)
	
2. 메인클래스 생성 후 객체 메인 함수에서 2번에서 만든 클래스 객체 만들기
 1) 클래스명 : FruitMain
 2) Banana, Orange, Apple 객체 생성(값 임의로 넣기) 
*/
public class Fruit {
	String name;
	private String color;
	private int price;
	
	// 생성자 
	Fruit (String name, String color, int price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}
	

	void getPrice() {
		System.out.println(name + "의 가격은 " + price + "원 입니다.");
	}
}
