package day02_0618;

import java.util.Scanner;

public class Unlimited_roop_review01 {

	public static void main(String[] args) {
		// 스캐너와 for문을 활용한 무한 루프
		// 스캐너 클래스 선언
		Scanner s = new Scanner(System.in);
		
		// for문
		for(;;) {
			System.out.println("숫자 입력란 (-1을 입력할시 종료) : ");
			int score = s.nextInt();
			
			if (score == -1) {	// -1을 입력할시, for문 종료 (break)
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			if(score > 100 || score < 0) {
				System.out.println("잘못된 숫자임");
			} else if(score >= 80) {
				System.out.println("A");
			} else if(score >= 60) {
				System.out.println("B");
			} else {
				System.out.println("C");
			}
		}
	}
}
