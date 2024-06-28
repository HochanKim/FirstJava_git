package day10_0628;

import java.util.Scanner;	// 스캐너(클래스) 기능 가져오기
import java.util.StringTokenizer;

// 3. Scanner를 이용하여 한 라인을 읽고, 공백으로 분리된 어절이 몇 개 들어 있는지 
// "그만"을 입력할 때까지 반복하는 프로그램을 작성하라.
/*

	>>I love Java.
	어절 개수는 3
	>>자바는 객체 지향 언어로서 매우 좋은 언어이다.
	어절 개수는 7
	>>그만
	종료합니다...

*/
public class Stop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
		while (true) {
			System.out.print("문장 입력하기 : ");
			String input = scan.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			int count = st.countTokens();
			if (input.equals("그만")) {
				// 문자열은 equals() 사용
				System.out.println("종료합니다...");
				break;
			} 
			System.out.println("어절 개수는 "+ count);
		}
		scan.close();
	}

}
