package secure;

import java.util.Scanner;

public class Review06 {

	public static void main(String[] args) {
		// 반복문 학습
		
		// '-1'을 입력하는 순간 무한루프를 빠져나가고 프린트문 출력하기
//		Scanner scan = new Scanner(System.in);
//		int i = 1;
//		int sum = 0;
//		while(true) {
//			System.out.print(i + "번째 숫자 입력 : ");
//			int num = scan.nextInt();
//			i++;
//			// '-1' 조건 설정 ('-1'은 계산식하고 개수에 반영 X)
//			if(num == -1) {
//				sum += 0;
//				i--;
//				break;
//			}
//			sum += num;
//		}
//		System.out.println("숫자 " + (i-1) + " 번째의 합은 " + sum + " 입니다.");
		
		Scanner scan = new Scanner(System.in);
		int i = 1;
		int sum = 0;
		while(true) {
			System.out.print(i + "번째 숫자 입력 : ");
			int num = scan.nextInt();
			// '-1' 조건 설정 ('-1'은 계산식하고 개수에 반영 X)
			if(num == -1) {
				break;
			} else {
				sum += num;
			}
			i++;
		}
		System.out.println("숫자 " + (i-1) + " 번째의 합은 " + sum + " 입니다.");

	}

}
