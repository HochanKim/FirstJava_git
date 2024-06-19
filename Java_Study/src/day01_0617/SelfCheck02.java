package day01_0617;

public class SelfCheck02 {

	public static void main(String[] args) {
		// 확인문제
		int num1 = 1;
		int num2 = 2;
		int num3 = 3;
		num2 = num1++;	// 후위연산, num1 = 2, num2 = 1
		// num2는 num1++의 연산 이전 값인 1이고 num1은 덧셈 연산 이후의 값인 2이다.

		System.out.println(num1 == num2);	// false
		System.out.println(num2 >= num1 && num2 >= num3);	// false, and 연산
		System.out.println(num1 % 2 == 0);	// true
		System.out.println(!(num3 > num2));	// false, '!'(부정의 의미)
		System.out.println(num1 >= num3 || num2 == 2);	// false, or 연산
	}

}
