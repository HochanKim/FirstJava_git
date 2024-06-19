package day03_0619;

import java.util.Scanner;
import java.util.Random;

public class Practice04 {

	public static void main(String[] args) {
		// 반복문을 통해 1부터 30까지 중 3의 배수이거나 7의 배수일 경우만 화면에 출력
		for (int i=1; i<=30; i++) {
			if (i % 3 == 0 || i % 7 == 0) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 반복문을 통해 1부터 30까지 중 홀수의 합과 짝수의 합의 차이를 구하기
		int oddSum = 0;
		int evenSum = 0;
		for (int j=1; j<=30; j++) {
			if (j % 2 == 1) {
				oddSum += j;
			}
			if (j % 2 == 0) {
				evenSum += j;
			}
		}
		System.out.println(oddSum + evenSum);
		System.out.println();
		
		// 구구단 문제는 랜덤 숫자 2개 조합으로 출제 - 실행 시 문제가 계속 바뀌도록
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0;	// 점수 세기 (값 초기화 0 대입)
		for (int i = 1; i <= 5; i++) {
			//	int count = 0;	=> 점수가 반복적으로 초기화됨
			int x = ran.nextInt(8) + 2;		// (0 ~ 7 + 2) = 2 ~ 9
			int y = ran.nextInt(9) + 1;		// (0 ~ 8 + 1) = 1 ~ 9
			System.out.println(x + " * " + y + " = ");
			int answer = s.nextInt();
					
			if ((x*y) == answer) {
				System.out.println("정답 !");
				count = count + 20;	// 정답을 맞추면 점수 증가 (한 문제당 +20)
			} else {
				System.out.println("오답 !, 정답은 "+(x*y)+"입니다");
			}
			
			if (i == 5) {
				System.out.println("5문제 풀이 끝!");
				System.out.println(count+"점 입니다! (한 문제당 20점)");
			}
		}
	}

}
