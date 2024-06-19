package day01_0617;

public class Var04 {

	public static void main(String[] args) {
		// 부등호 연산
		int num1 = 10;
		int num2 = 15;
		int num3 = 15;
		
		System.out.println(num1 > num2); 	// false
		System.out.println(num2 > num3); 	// false
		System.out.println(num2 <= num3); 	// true, 부등호 기호는 항상 뒤에 위치
		System.out.println(num3 > num1); 	// true
		System.out.println(num2 = num3); 	// 15, 프로그래밍에서 부등호 1개는 '같다'가 아닌 '대입하다'를 의미
		System.out.println(num3 == num1); 	// true, 프로그래밍에서 '같다'는 부등호 2개
		System.out.println(num1 != num2); 	// true, 프로그래밍에서 '!'는 부정의 의미 ('!=' : 같지않다)
		System.out.println(!true); 	// false
		System.out.println(num1+num2 > num3); 	// true, 연산 논리
		System.out.println(7/2 > 3); 	// false, 정수간의 연산 논리 (몫 : 3 = 3 / false)
		System.out.println(7/2.0 > 3); 	// true, 실수의 연산 논리 (몫 : 3.5 > 3 / true)
		System.out.println(7 % 2 == 0); 	// false, 나머지 연산(%) 논리 (나머지 : 1 == 0 / false)
		System.out.println();
		
		// AND(&&) (둘 다 만족할때 참), OR(||) (둘 중 하나가 만족해도 참)
		System.out.println(num2 > num1 && num2 >= num3);	// true and true => true
		System.out.println(num1 > num2 || num2 >= num3);	// false or true => true
	}

}
