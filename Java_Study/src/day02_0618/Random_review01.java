package day02_0618;

import java.util.Random;	// 랜덤 기능 가져오기
import java.util.Scanner;	// 스캐너 기능 가져오기

public class Random_review01 {

	public static void main(String[] args) {
		// 랜덤 게임
		Scanner s = new Scanner(System.in);	// 스캐너(객체) 클래스 선언
		Random ran = new Random();			// 랜덤(객체) 클래스 선언

		int ranNum = ran.nextInt(100) + 1; //1~100
		int cnt = 0;	// 입력 횟수를 세기 위한 정수형 변수 cnt
		for(;;) {	// 반복문
			System.out.print("숫자를 입력하세요 : ");		// 입력문 설정
			int input = s.nextInt();	// 위에 입력받은 숫자를 받아 밑에 메소드에 적용
			cnt++;	// 입력 횟수
			
			// 랜덤게임 조건문
			if(ranNum > input) {
				System.out.println("UP!");
			} else if(ranNum < input) {
				System.out.println("DOWN!");
			} else {
				System.out.println("정답입니다!");
				System.out.println(cnt + "번 만에 맞추셨습니다.");
				break;
			}
		}
	}

}
