package secure;

import java.util.Scanner;

public class Review05 {

	public static void main(String[] args) {
		// 반복문 (Roof) => while
		// for 와 while의 차이
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		System.out.println();
//		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		
		Scanner scan = new Scanner(System.in);
		int j = 1;
		int sum = 0;
		while(true) {
			System.out.print(j + "번째 숫자 입력 : ");
			int num = scan.nextInt();
			sum += num;
			if(sum >= 100) {
				break;
			}
			j++;
		}
		System.out.println("숫자 " + j + " 번째의 합은 " + sum + " 입니다.");
		
	}

}
