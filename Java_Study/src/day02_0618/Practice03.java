package day02_0618;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		// 1부터 30에서 3의 배수만 출력하기
		int i;
		for (i=1; i<=30; i++) {
			if (i % 3 == 0) {	// 3의 배수 출력을 위한 나머지연산 조건문
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 구구단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		for (int a=1; a<=9; a++) {
				System.out.println(num +" X "+ a +" = "+ (num * a));
		}
	}
}
