package day05_0621;

public class Fruit {
	String name;
	int price;
	
	Fruit (String name, int price) {	// 클래스와 반드시 동일한 이름을 가진 생성자
		this.name = name;
		this.price = price;
//		System.out.println("상품명 : 캘리포니아산 "+name+"\n가격 : "+price);
	}
	
	Fruit (String name) {	// 메소드 오버로딩
		this.name = name;
		System.out.println(name);
	}
	
	Fruit () {	// 새로운 생성자 생성(빈값)
		System.out.println("과일정보 없음");
	}	
	
	int getPrice(int num) {		// 객체에서 받을 변수를 저장
		return (price * num);
	}

}
