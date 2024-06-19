package day03_0619;

import java.util.Scanner;

public class SelfCheck04 {

	public static void main(String[] args) {
		// 스캐너(입력), for문(반복), if-else문(조건) 응용 연습
		// 스캐너 클래스 선언
		Scanner num = new Scanner(System.in);
		
		for (;;) {
			System.out.print("점수 입력 : ");		// 입력 구문
			int score = num.nextInt();			// 입력받은 숫자를 담아서 아래 메소드에 적용
			
			// 조건문 1 (등급 부여)
			if (score <= 100 && score >= 90) {	// and 연산 활용
				System.out.println("A학점");
			} else if (score < 90 && score >= 80) {
				System.out.println("B학점");
			} else if (score < 80 && score >= 70) {
				System.out.println("C학점");
			} else if (score < 70 && score >= 60) {
				System.out.println("D학점");
			} else if (score < 60 && score >= 0) {
				System.out.println("낙제");
			} else {	// 범위 : score > 100 or score < 0 (or 연산)
				System.out.println("잘못된 점수 입력입니다");
			}
			
			// 조건문 2 (break 적용)
			if (score > 100 || score < 0) {
				System.out.println("오류로 인한 프로그램 종료");
				break;
			}
		}
	}

}
