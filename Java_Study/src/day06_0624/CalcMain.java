package day06_0624;

public class CalcMain {

	public static void main(String[] args) {
		// 3-3. main이 포함된 클래스를 생성하고 main 메소드 내에 아래 조건에 맞게 작성하시오.
		// - Calc클래스의 메소드를 호출하시오(sum 1개, multiple 3개)
		
		// sum 1개
		System.out.println(Calc.sum(1, 2));
		
		// multiple 3개
		System.out.println(Calc.multiple(3, 6));
		System.out.println(Calc.multiple(1, 2, 3));
		System.out.println(Calc.multiple(2.5, 2));
	}

}
