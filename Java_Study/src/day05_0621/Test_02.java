package day05_0621;
// 2. 숫자를 1개 입력받고 아래 조건에 맞게 조건문을 작성하시오.
/*
 * 조건) 입력받은 숫자가 65~100 사이의 숫자일 경우 '큰 수'
       	30~64 사이의 숫자일 경우 '중간 수'
	   	0~29 사이의 숫자일 경우 '작은 수' 라고 출력
	   	만약, 100 초과, 0미만의 숫자를 입력할 경우 숫자를 다시 입력하도록 함.
 * */
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 입력을 위한 클래스 'Scanner' 접근 및 객체 생성
		System.out.print("숫자를 입력하세요 : ");	// 임의의 숫자를 입력
		int number = scan.nextInt();			// 위에서 입력받은 숫자를 저장할 변수 'number' 설정
		
		// 조건문 설정
		if (number >= 65 && number <= 100) {
			System.out.println("큰 수");
		} else if (number >= 30 && number < 65) {
			System.out.println("중간 수");
		} else if (number >= 0 && number < 30) {
			System.out.println("작은 수");
		} else {
			System.out.print("다시 입력하세요");
		}
		scan.close();
	}

}
