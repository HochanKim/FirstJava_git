package day13_0703_jdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		int arr[] = {1, 3, 4, 10, 0};
		// arr[4]에 숫자를 하나 입력받아서 넣기
		// arr배열에 중복된 값이 있으면 넣지 말고
		// 다시 입력받기
		Scanner scan = new Scanner(System.in);
//		while(true) {
//			System.out.print("임의의 수를 입력하세요 >> ");
//			int num = scan.nextInt();
//			arr[4] = num;
//				if(arr[0] == num) {
//					System.out.println("다시 입력하세요");
//					continue;
//				} else if (arr[1] == num) {
//					System.out.println("다시 입력하세요");
//					continue;
//				} else if (arr[2] == num) {
//					System.out.println("다시 입력하세요");
//					continue;
//				} else if (arr[3] == num) {
//					System.out.println("다시 입력하세요");
//					continue;		
//				} else {
//					System.out.println(true);
//					System.out.println(Arrays.toString(arr));
//					break;
//				}
//				
//			}
//		scan.close();

		// arr[4]에 숫자를 하나 입력받아서 넣기
		// arr배열에 중복된 값이 있으면 true
		// 아니면 false 출력
//		int arr[] = {1, 3, 4, 10, 0};
//		System.out.print("임의의 수를 입력하세요 >> ");
//		int input = scan.nextInt();
//		// 새로운 변수 선언
//		boolean flg = false;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] == input) {
//				flg = true;
//				break;
//			} 
//		}
//		System.out.println(flg);
		
		// arr[4]에 숫자를 하나 입력받아서 넣기
		// arr배열에 중복된 값이 있으면 넣지 말고
		// 다시 입력받기
		// int arr[] = {1, 3, 4, 10, 0};
			
			while (true) {
				System.out.print("숫자를 입력하세요 : ");
				int input = scan.nextInt();
				boolean flg = false;
				for(int i=0; i<arr.length; i++) {
					if(input == arr[i]) {
						System.out.println("다시 입력하세요.");
						flg = true;
						break;
					}
				}
				if(flg == false) {
					arr[4] = input;
					break;
				}
				System.out.println(Arrays.toString(arr));
			}
			System.out.println(Arrays.toString(arr));
	}	
}


	


