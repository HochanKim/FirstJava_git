package day02_0618;

import java.util.Scanner;

public class Scan02 {	// 스캐너와 조건문

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num1 = scan.nextInt();		
		if(num1 > 5) {	// 논리형(불리언값) 조건 설정
			System.out.println("조건 만족!");
		} else {
			System.out.println("조건 불만족...");
		}
	}

}
