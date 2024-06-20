package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class SelfCheck05_02 {
	/*
	4. 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 
		큰 수 인지 아닌지 판별하기
		(ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)

	5. 1부터 30까지 10~19의 숫자를 제외하고 화면에 출력하시오.
		(ex. 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)

	6. while 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.
		단, 4단과 8단은 출력하지 말 것.
	*/
	public static void main(String[] args) {
		// 1부터 100 사이의 랜덤한 숫자를 생성하고, 숫자를 입력 받아 랜덤한 숫자와 비교하여, 큰 수 인지 아닌지 판별하기
		// (ex, 랜덤 수 : 35, 입력 수 : 40 일 경우 '입력한 수가 더 큽니다' 출력, 반대일 경우 작다고 출력)
		Scanner s = new Scanner(System.in); 	// 스캐너 클래스 선언
		Random ran = new Random();				// 랜덤 클래스 선언
		
		int ranNum = ran.nextInt(100) + 1;	// 컴퓨터가 뽑은 임의의 수, 1~100까지 범위 설정
		
			System.out.print("임의의 숫자를 입력하세요 : ");
			int pick = s.nextInt();		// 변수 pick 선언하여 위의 입력값 저장
			if (pick > ranNum) {
				System.out.println("입력한 수가 더 큽니다.");
				System.out.println();
			} else if (pick < ranNum) {
				System.out.println("입력한 수가 더 작습니다.");
				System.out.println();
			} else if (pick == ranNum) {
				System.out.println("맞췄습니다!");
			}
		s.close();
		
		// 1부터 30까지 10~19의 숫자를 제외하고 화면에 출력하시오.
		// (ex. 1 2 3 4 5 6 7 8 9 20 21 22 ... 30)
		for (int i=1; i<=30; i++) {
			if(i >= 10 && i < 20) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		
		// while 문을 이용하여 2단부터 9단까지 구구단을 출력하시오.
		// 단, 4단과 8단은 출력하지 말 것.
		int i = 2;	// 구구단의 변수 i 설정 (i단)
		while (i <= 9) {
			int j = 1;		// 구구단에서 i와 곱해질 변수 j 설정
			if (i % 4 == 0 || i % 8 == 0) {
				i++;
			}
			while (j <= 9) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			i++;	// 변수 i에 증감식 사용 => i범위 1부터 8까지에 '+1' 효과 => 2부터 9까지 범위 설정
		}
	}
}


