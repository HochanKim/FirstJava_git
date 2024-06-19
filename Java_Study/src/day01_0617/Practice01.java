	/* 
		1. 아래 이미지와 같이 결과가 나오도록 코드를 작성하시오.
		(조건 : 평균점수를 기준으로 90점 이상 'A', 80점 이상 'B', 70점 이상 'C', 그 외 F이며, 
		점수는 0~100 사이의 숫자를 정상적으로 입력한다고 가정하고 진행)
	*/

package day01_0617;

import java.util.Scanner;	// 스캐너 객체 가져오기

public class Practice01 {
		
	public static void main(String[] args) {

		// 이름 넣기
		Scanner scan = new Scanner(System.in);		// 스캐너 기능 설정
		System.out.println("이름을 입력해주세요 : "); 	// 이름 입력
		String name = scan.nextLine();				// 이름 입력을 위한 스캐너 설정
		
		// 점수 입력
		System.out.println("수학 점수 : ");	// 수학 점수 입력
		int math = scan.nextInt();			// 수학 점수 입력을 위한 스캔 설정
		
		System.out.println("영어 점수 : ");	// 영어 점수 입력
		int eng = scan.nextInt();			// 영어 점수 입력을 위한 스캔 설정
		scan.close();	// 스캐너 기능 종료
		
		// 조건문에 사용할 변수 설정 및 초기화
		double avg = (math + eng) / 2.0;	//	평균 점수 변수(실수형 변수, 변수명 'avg')
		char level = ' ';					// 변수 초기화	(문자열 변수, 변수명 'level')
		
		// 등급 설정 (if~else 조건문 활용)
		if (avg > 100 || avg < 0) {
			System.out.println("잘못된 점수입니다.");
		} else if (avg >= 90) {
			level = 'A';	// 문자열 변수 level에 if문 설정에 맞는 조건과 관련한 값 대입
		} else if (avg >= 80) {
			level = 'B';
		} else if (avg >= 70) {
			level = 'C';
		} else {
			level = 'F';
		}
		
		// 최종 출력문
		System.out.println(name+"님의 평균 점수는 "+avg+", 등급은 "+level+"입니다.");
	}
	
}
