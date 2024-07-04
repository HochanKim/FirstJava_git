package day14_0704;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_review {
	public static void main(String[] args) {
		// 숫자를 입력받아 5개의 공간 채우기
		// 중복을 허용하지 않는다.
//		int arr[] = new int[5];		// 객체 배열 선언 및 크기가 5인 배열 생성
//		Scanner scan = new Scanner(System.in);
//		for (int i=0; i<arr.length; i++) {
//			System.out.print((i+1)+"번째로 넣을 숫자를 입력하시오 : ");
//			int number = scan.nextInt();
//			arr[i] = number;
//			
//			// 배열에 입력한 숫자 중복일 경우, 실행되는 반복문
//			for (int j=0; j<i; j++) {
//				if (arr[i] == arr[j]) {
//					System.out.println("중복 숫자를 입력했습니다. 새로운 숫자를 입력하세요");
//					i--;
//				}
//			}
//			System.out.println(Arrays.toString(arr));
//		}
//		System.out.println();
//		System.out.println("최종 입력 배열");
//		System.out.println(Arrays.toString(arr));
		
		// 숫자를 입력받아서 8개의 공간 채우기
		// 중복은 2개까지만 허용
		// ex. [1, 2, 1, 3, 4, 2, 10, 10] : [1] : 2개, [2] : 2개, [10] : 2개 (O) 
		// ex. [1, 1, 1, 3, 4, 2, 10, 10] : [1] : 3개 (X) 
		int arr[] = new int[8];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("숫자를 입력하세요 : ");
			int num = scan.nextInt();
			arr[i] = num;
			int cnt = 0;	// 카운트 변수
			for (int j=0; j<i; j++) {
				if (arr[i] == arr[j]) {
					cnt++;	// 카운트 횟수
					if(cnt >= 2) {
						System.out.println("동일한 숫자는 최대 2개만 허용");
						i--;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
}