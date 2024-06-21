package day05_0621;

public class Fruit_Object {

	public static void main(String[] args) {
		Fruit orange = new Fruit("오렌지", 1500);
		int price = orange.getPrice(3);		// 클래스에 리턴할 값 전달
		// getPrice(int num) => int num = 3
		// int num = 3;
		// int price = orange.getPrice(num);
		System.out.println(price);
		
		Fruit apple = new Fruit("사과");
		Fruit temp = new Fruit();	// 생성자를 1개라도 작성했을 경우 기본 생성자는 생성되지 않는다.
	}

}
