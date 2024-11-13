package secure;

import java.util.*;
import java.lang.*;
import java.io.*;


class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = scan.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = scan.nextInt();
			
			// 예외처리 (시큐어 코딩)
			try {
				System.out.println("첫 번째 숫자를 두 번째 숫자로 나눈 값은 '"+ (num1/num2) +"' 이다.");
				scan.close();
				break;	// 'While'문 종료
				
			} catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없음.");
			}
		}
	}
}
