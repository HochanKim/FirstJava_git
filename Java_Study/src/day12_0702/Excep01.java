package day12_0702;

import java.util.Scanner;

public class Excep01 {

	public static void main(String[] args) {
		// 예외처리
		Scanner scan = new Scanner(System.in);
		System.out.print("나눌 수 : ");
		int num1 = scan.nextInt();
		System.out.print("나누는 수 : ");
		int num2 = scan.nextInt();
		
		// 예외발생
//		System.out.println(num1 / num2);
		int arr [] = {1,2,3};
		
		// 예외처리를 위한 구문 작성
		try {
			System.out.println(num1 / num2);
//			arr[3] = 10;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {	// 'catch'도 'if, else if'처럼 반복 작성 가능
			System.out.println("배열 최대 인덱스 초과하여 접근 안됨");
		} finally {
			System.out.println("무조건 실행된다.");
		}
	}

}
