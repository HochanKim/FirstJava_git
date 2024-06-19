package day2_before;

import java.util.Scanner;

public class If_test01 {

	public static void main(String[] args) {
		// 숫자를 한 개 입력 받아서 해당 숫자가 50이상이면 "50 이상입니다." 출력
		// 아닐 경우, "50 미만입니다." 출력
		Scanner scan = new Scanner(System.in);	// 스캐너 변수 scan 선언
		System.out.print("숫자를 입력하세요 : ");	// 스캐너 변수를 입력받을 문구
		int number = scan.nextInt();	// 정수 변수 number (스캐너 변수 사용)
		
		if (number >= 50) {		// if 조건문
			System.out.println("50 이상입니다.");
		} else {	// else 구문
			System.out.println("50 미만입니다.");
		}
		
		if (number % 2 == 0) {		// if 조건문 (홀짝 구분)
			System.out.println("이 수는 짝수입니다.");
		} else {	// else 구문
			System.out.println("홀수입니다.");
		}
		scan.close();	// 스캐너 종료		
	}

}
