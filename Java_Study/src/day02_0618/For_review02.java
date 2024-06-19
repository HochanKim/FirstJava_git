package day02_0618;

import java.util.Scanner;	// 스캐너 기능 불러오기

public class For_review02 {

	public static void main(String[] args) {
		// 1부터 내가 입력한 숫자까지의 합 (스캐너 기능 사용)
		Scanner scan = new Scanner(System.in);	// 객체 '스캐너'의 클래스 선언
		System.out.print("임의의 숫자를 입력하세요 : ");
		int num = scan.nextInt();	// 위에서 입력받은 숫자를 받아 밑에 메소드에 적용
		
		// 반복 for문
		int sum = 0;	// 정수형 변수 sum 선언 (0을 대입하여 값을 초기화)
		int i;
		for (i=1; i<=num; i++) {
			// 선언문 : 정수형 변수 i에 1을 대입
			// 조건문 : i부터 위에 입력한 숫자까지 반복
			// 증감식 : 덧셈 (1씩 증가)
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
