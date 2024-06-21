package day05_0621;
import java.util.Scanner;

// 1. 숫자를 1개 입력받고 해당 숫자가 홀수인지 짝수인지 판별하시오.

public class Test_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 클래스 'Scanner' 접근, 'Scanner' 객체 생성 후 레퍼런스 변수 'scan' 설정
		System.out.print("숫자를 입력하세요 : ");	// 임의의 숫자를 입력
		int number = scan.nextInt();	// 위에서 입력받은 숫자를 저장할 변수 'number' 설정
		
		// 홀수, 짝수를 판별하기 위한 조건문
		if (number % 2 == 1) {
			System.out.println("입력한 숫자는 홀수");
		} else {
			System.out.println("입력한 숫자는 짝수");
		}
		scan.close();
	}
}
