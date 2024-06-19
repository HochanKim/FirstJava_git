package day2_before;

import java.util.Scanner;	// 스캐너 기능 가져오기

public class If_test02 {

	public static void main(String[] args) {
		// 2개의 숫자를 입력받아서 두 수의 합이 홀수일 경우 '홀수' 출력
		// 짝수일 경우 '짝수' 출력
		Scanner plus = new Scanner(System.in);
		System.out.println("첫 번째 숫자를 입력하세요 : ");
		int num1 = plus.nextInt();		
		System.out.println("두 번째 숫자를 입력하세요 : ");
		int num2 = plus.nextInt();
		int sum = num1 + num2;
		
		if (sum % 2 == 1) {
			System.out.println("홀수");
		} else {
			System.out.println("짝수");
		}
		plus.close();
	}
	
}

