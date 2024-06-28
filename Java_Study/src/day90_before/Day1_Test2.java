package day90_before;

import java.util.Scanner;	// 스캐너 기능

public class Day1_Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력하세요 : ");
		String gender = scan.nextLine();	// 문자열을 입력받은 함수
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();	// 정수를 입력받은 함수
		scan.close(); 	// 스캐너 기능 종료선언 
	}

}
