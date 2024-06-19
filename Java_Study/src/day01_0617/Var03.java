package day01_0617;

public class Var03 {

	public static void main(String[] args) {
		// 선위연산자, 후위연산자
		int num1 = 10;
		
		// 선위연산자 1
		int num2 = ++num1;			// num2 = 11, num1 = 11 (선위 연산으로 먼저 오른쪽을 연산한 후 왼쪽에 대입)
		System.out.println(num2); 	// 11 (선위연산자 연산 결과)
		// 후위연산자 1
		int num3 = num2++;			// num3 = 11(위의 num2값 선대입), num2 = 12(후연산)
		System.out.println(num3); 	// 11 (후위연산자 연산 결과)
		
		// 후위연산자 2
		int num4 = num3++;			// num4 = 11(위의 num3값 선대입), num3 = 12 (후위 연산으로 왼쪽에 먼저 대입 후 오른쪽 연산)
		System.out.println(num4); 	// 11 (후위연산자 연산 결과)
		// 선위연산자 2
		int num5 = ++num4;			// num5 = 12(연산한 오른쪽값 대입), num4 = 12(선연산)
		System.out.println(num5); 	// 12 (선위연산자 연산 결과)
		
		System.out.println();
		
		int num01 = 30;
		int num02 = num01++;	// num02 = 30, num01 = 31
		num02 = num01++;		// num02 = 31, num01 = 32
		num02 = num01--;		// num02 = 31, num01 = 31
		num02 = --num01;		// num02 = 30, num01 = 30
		System.out.println(num01);
		System.out.println(num02);
	}

}
