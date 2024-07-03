package day13_0703_jdbc;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 0;
		// 스캐너를 숫자 하나 입력받아서
		// num1보다 크면 num2에 저장하기
		Scanner scan = new Scanner(System.in);
//		while (true) {
//			System.out.print("숫자 입력하기 >> ");
//			num2 = scan.nextInt();
//			if (num2 < 100) {
//				System.out.println("100보다 큰 수를 입력해주세요");
//				continue;
//			} else {
//				System.out.println("입력 완료 = "+num2);
//			}
//			break;
//		}
//		System.out.println(num1+", "+num2);
		
		// num1 미만일 경우 num2에 -1을 저장
//		System.out.print("숫자 입력하기 >> ");
//		int input = scan.nextInt();
//		if (num1 > input) {
//			num2 = -1;
//		} else {
//			num2 = input;
//		}
////		num2 = input >= num1 ? input = -1;
//		System.out.println(num1+", "+num2);
		
		// num1 미만일 경우 다시 입력하도록
		// 최종적으로 num1보다 큰 수 일때 출력하고 종료
		while (true) {
			System.out.print("숫자 입력하기 >> ");
			int input = scan.nextInt();
			if (num1 >= input) {
				System.out.println("다시입력하세요.");
				continue;
			} else {
				num2 = input;
				System.out.println("입력 완료");
			}
			break;
		}
		System.out.println("num1 = "+num1+", num2 = "+num2);
		scan.close();
	}

}
