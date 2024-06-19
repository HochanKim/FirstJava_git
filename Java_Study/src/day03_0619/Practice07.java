/* 
 구구단 프로그램을 만드세요.
	1. 처음 출력은 "문제풀이(1) 종료(그외 숫자)"
	
	2. 1을 선택하면 "몇 문제 푸시겠습니까?" 출력 후
		사용자가 입력한 숫자만큼 랜덤한 구구단 문제 출제 
 		정답을 맞출 경우 "정답!" 아닐경우 "오답!" 출력
 		
	3. 문제를 다 풀었을 경우 다시 1번으로 돌아가서 선택하게 함
	
	4. 1번메뉴에서 1을 제외한 다른 숫자를 누르면 
 		"프로그램이 종료되었습니다" 출력 후 종료
*/
package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class Practice07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rnd = new Random();
		
		while (true) {	// 입력한 수만큼의 문제를 다 풀었을 경우 다시 첫 출력으로 돌아가서 선택하게 함 (메인 반복문 => while문 사용)
			System.out.print("문제풀이(1), 종료(기타 숫자) : ");	// 구구단 프로그램 실행을 위한 의사묻기 (첫 출력)
			int solve = scan.nextInt();	// 위의 입력값을 받아서 대입하기 위한 변수 'solve'
			
			// 입력값 1을 대입시 실행되는 메인 조건문
			if (solve == 1) {
				System.out.print("몇 문제를 푸시겠습니까? : ");
				int choiceNum = scan.nextInt();
				
				// 구구단 문제 제출을 위한 서브 반복문(for문 사용)
				int i;
				for (i=1; i<=choiceNum; i++) {
					int x = rnd.nextInt(8) + 2;	// 구구단 범위 : 2단 ~ 9단 / nextInt(8) => 0~7 + 2 = 2~9
					int y = rnd.nextInt(9) + 1;	// x와 곱하는 숫자들 범위 : 1 ~ 9 / nextInt(9) => 0~8 + 1 = 1~9
					System.out.print(x+" X "+y+" = ");	// 임의의 숫자를 각각 해당하는 변수에 출력
					int ans = scan.nextInt();	// 문제에 대한 답을 입력하기 위한 변수 'ans'
					
					// 정답과 오답 처리를 위한 서브 조건문
					if (ans == (x*y)) {	// 정답 조건 및 출력
						System.out.println("정답!");
					} else { // 오답 조건 및 출력
						System.out.println("오답!");
					}
				}			
			} 
			
			// 입력값 1을 제외한 숫자 대입시 실행되는 메인 조건문
			else {	
				System.out.print("프로그램이 종료되었습니다");
				break;
			}
			
		}
		scan.close();
	}
}
