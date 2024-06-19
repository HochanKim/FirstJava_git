package day02_0618;
import java.util.Scanner;	// 스캐너 기능 가져오기

public class If_01 {

	public static void main(String[] args) {
		// 숫자를 1개 입력받아서 입력한 숫자가 홀수이면
		// "홀수입니다" 출력
		// 아닐경우, "짝수입니다" 출력
		
		// 입력 설정(Scanner)
		Scanner s = new Scanner(System.in);	// 객체 스캐너의 클래스 선언
		System.out.print("숫자를 입력하세요 : ");
		int number = s.nextInt();
		
		// 조건 설정 (If~else)
		if (number % 2 == 1) {	// 나머지 연산조건 설정
			System.out.println("홀수입니다");
		} else {
			System.out.println("짝수입니다");
		}
	}

}
