package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		// 구구단 시작 (1), 채점 (2), 종료(0)
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		int queNum = 0;	// 총 문제 보관 개수
		int cnt = 0;	// 정답 개수
		
		while (true) {
			System.out.print("구구단 시작(1), 채점(2), 종료(0) : ");
			int choiceNum = s.nextInt();
			
			if (choiceNum == 1) {	// 시작
				System.out.print("풀고싶은 문제의 수를 입력하세요 : ");	// 문제 개수 선택
				int q = s.nextInt();	// 위에서 입력한 값 적용
				queNum += q;
				for (int i=1; i<=q; i++) {
					// 선언부 : 변수 i에 1 대입
					// 조건부 : 위에서 입력한 값까지 반복
					// 증감식 : 덧셈 연산 (1씩 증가)
					int x = ran.nextInt(8) + 2; // 2~7
					int y = ran.nextInt(9) + 1; // 1~9
					
					int qa = 1;
					while (qa == 1) {
						System.out.print(x+" * "+y+" = ");
						int answer01 = s.nextInt();
						if (answer01 == x*y) {
							System.out.println("정답!");
							qa = 0;
							cnt++;
						} else {
							System.out.println("오답!");
							System.out.print("다시 풀어보시겠습니까? (예 : 1, 아니오 : 2) : ");
							qa = s.nextInt();	
						}
					}
				}
			} else if (choiceNum == 2) {	// 채점
				System.out.println("현재까지 "+queNum+"문제 중에 "+cnt+"문제를 맞췄습니다.");
			} else if (choiceNum == 0) {	// 종료
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
		s.close();
	}
}
