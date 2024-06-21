package day05_0621;

import java.util.Scanner;

public class Practice10 {

	public static void main(String[] args) {
		// switch문을 활용하여 학점 프로그램 만들기
		Scanner scan = new Scanner (System.in);
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		switch (score / 10) {		// 점수를 10에 나눈 몫을 case의 정수와 비교하여 출력
		case 10 :
		case 9 :
			System.out.println("A");
			break;
		case 8 :
			System.out.println("B");
			break;
		case 7 :
			System.out.println("C");
			break;
		default :
			System.out.println("F");
			break;
		}
		scan.close();
	}

}
