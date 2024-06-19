package day02_0618;

import java.util.Scanner;

public class For_review04 {

	public static void main(String[] args) {
		// 임의의 수 입력 + 구구단 출력
		// 입력 구문
		Scanner inputNum = new Scanner(System.in);	// 스캐너 클래스 선언, 스캐너명 inputNum
		System.out.println("임의의 수를 입력 : ");
		int a = inputNum.nextInt();
		
		// 구구단 출력을 위한 for문
		int i;
		for(i=1; i<10; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
			}
		}
	}


