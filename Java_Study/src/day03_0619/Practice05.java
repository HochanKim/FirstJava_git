package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class Practice05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		while (true) {
			System.out.print("구구단 시작(1), 종료(2) : ");
			int choiceNum = s.nextInt();
			
			if (choiceNum == 1) {	// 시작
				System.out.print("풀고싶은 문제의 수를 입력하세요 : ");	// 문제 개수 선택
				int q = s.nextInt();	// 위에서 입력한 값 적용
				for (int i=1; i<=q; i++) {
					// 선언문 : 변수 i에 1 대입
					// 조건문 : 위에서 입력한 값까지 반복
					// 증감식 : 덧셈 연산 (1씩 증가)
					int x = ran.nextInt(8) + 2; // 2~7
					int y = ran.nextInt(9) + 1; // 1~9
					System.out.print(x+" * "+y+" = ");
					int answer = s.nextInt();
				}
			} else if (choiceNum == 2) {	// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력해주세요");
			}
		}
	}

}
