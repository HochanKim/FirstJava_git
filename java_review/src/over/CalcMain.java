package over;

public class CalcMain {

	public static void main(String[] args) {
		// 객체 생성
		Calc calc = new Calc();
		
		// 메소드 호출
		int num1 = calc.sum();
		System.out.println(num1);
		
		int num2 = calc.sum(1, 2);
		System.out.println(num2);
		
		int num3 = calc.sum(1, 3, 5);
		System.out.println(num3);

		double num4 = calc.sum(1.5, 3.5);
		System.out.println(num4);
		
		double num5 = calc.sum(5, 5);
		System.out.println(num5);
	}

}
