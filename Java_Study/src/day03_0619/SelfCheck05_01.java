
package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class SelfCheck05_01 {
	/*
	1. 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력

	2. 숫자를 두개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력

	3. 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
		(ex, 2입력시 2*1=2, 2*2=4, 2*3=6 ... 2*9=18 출력)
	*/
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // 스캐너 클래스 선언
		Random ran = new Random();	// 랜덤 클래스 선언
		
		// 10부터 50까지 중 3의 배수이면서 짝수만 화면에 출력
		for (int i=10; i<=50; i++) {
			if (i % 3 == 0 && i % 2 == 0) {
				System.out.println("3의 배수 & 짝수 : "+i);
				System.out.println();
			}
		}
		
		// 숫자를 두 개 입력받고, 두 수의 합이 10이 넘을 경우 '큰 수' 아닐 경우 '작은 수' 출력
		System.out.print("첫 번째 수를 입력하세요 : ");
		int a = s.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int b = s.nextInt();
		
		if (a+b > 10) {
			if (a>b) {
				System.out.println(a);
			} else {
				System.out.println(b);
			}
		} else {
			if (a>b) {
				System.out.println(b);
			} else {
				System.out.println(a);
			}
		}
		
		// 숫자를 하나 입력받고, 해당 숫자의 구구단 출력
		System.out.print("임의의 숫자를 입력하세요 : ");
		int c = s.nextInt();
		
		int i;
		for (i=c; i<=c; i++) {
			System.out.println("== "+c+"단== ");
			int j;
			for(j=1; j<=9; j++) {
				System.out.println(c+" * "+j+" = "+(i*j));
			}
		}
	}

}
