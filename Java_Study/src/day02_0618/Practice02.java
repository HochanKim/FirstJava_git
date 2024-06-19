package day02_0618;
import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		// 조건문 연습문제
		// 스캐너(입력)
		Scanner num = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = num.nextInt();
		
		// 조건문
		if (score > 100 || score < 0) {	// 100을 초과한 숫자나 음수 입력시,
			System.out.println("잘못된 숫자 범위입니다");
		} else if (score >= 80) {
			System.out.println("A");
		} else if (score >= 60) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
