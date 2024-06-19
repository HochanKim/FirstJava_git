package day03_0619;

import java.util.Random;
import java.util.Scanner;

public class SelfCheck03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random rnd = new Random();
		
		int ranNum = rnd.nextInt(100) + 1;
		// 컴퓨터가 임의로 선택한 숫자
		// 1부터 100까지 범위 설정
		// 인덱스가 0부터 시작하기 때문에 뒤에 '+1'을 붙임
		int count = 0;
		// 랜덤게임 인풋 횟수를 위한 변수 count
		// 초기화값 0을 우선 대입
		
		for (; ;) {
			System.out.println("임의의 숫자를 입력하세요 : ");	// 입력 문구
			int input = s.nextInt();
			// 위의 입력한 숫자를 받기 위한 변수 input
			count++;
			// 입력 횟수 세는 변수 count
			
			if(ranNum > input) {
				System.out.println("올려");
			} else if (ranNum < input) {
				System.out.println("내려");
			} else {
				System.out.println("정답입니다~");
				System.out.println("당신은 "+ count +"번째에서 맞추셨습니다.");
				break; 
				// 정답을 맞출 경우 프로그램 종료
			}
		}

	}

}
