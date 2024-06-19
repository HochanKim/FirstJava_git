package day02_0618;

import java.util.Scanner;

public class Scan01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 객체 '스캐너'의 클래스 선언
		
		System.out.print("이름을 입력하세요 : ");
		String name1 = scan.nextLine();	// 문자열 입력, nextLine()
		
		System.out.print("나이를 입력하세요 : ");
		int age1 = scan.nextInt();	// 정수 입력
		
		System.out.println(name1 + "님의 나이는 " + age1 + "세 입니다.");
		System.out.println();
		
		System.out.print("나이를 입력하세요 : ");
		int age2 = scan.nextInt();	// 정수 입력
		
		System.out.print("이름을 입력하세요 : ");
		String name2 = scan.next();	// 문자열 입력, next()
		
		System.out.println(name2 + "님의 나이는 " + age2 + "세 입니다.");
	}

}

/*
 * next()와 nextLine()의 차이 *
 
 * next() : 공백(스페이스)이 있기 전의 문자열만 출력된다.
 ex) 
 	System.out.print("이름을 입력하세요 : 리오넬 메시");
	String name1 = scan.next();	
	System.out.println(name1 + "님 반갑습니다.");
	출력 결과 : 리오넬님 반갑습니다.
	
 * nextLine() : 공백(스페이스) 상관없이 모든 문자열이 출력된다.
 ex)
 	System.out.print("이름을 입력하세요 : 크리스티아누 호날두");
	String name2 = scan.next();	
	System.out.println(name2 + "님 반갑습니다.");
	출력 결과 : 크리스티아누 호날두님 반갑습니다.
 
 */
