package day06_0624;

public class Multiple_Main {

	public static void main(String[] args) {
		// 'MultipleCalc' 클래스에 접근하여 객체 생성
		// 클래스 이름으로 접근할 수 있도록 선언
		MultipleCalc calc = new MultipleCalc();
		
		// 직접 접근하여 호출해보기
		int mul2 = calc.multiple(5, 6);
		int mul3 = calc.multiple(10, 20, 30);
		
		// 출력
		System.out.println(mul2);
		System.out.println(mul3);
	}

}
