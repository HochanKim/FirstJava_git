package special;

import java.util.Arrays;
import java.util.Scanner;

public class Array_repeat {

	public static void main(String[] args) {
		// 숫자를 입력받아 5개의 공간 채우기
		// 중복을 허용하지 않는다.
		int arr1[] = new int[5];	// 5개의 공간을 받을 배열 생성
		Scanner scan = new Scanner(System.in);	// 입력 객체 생성
		
		// 배열 반복문
		for(int i=0; i<arr1.length; i++) {
			// 입력
			System.out.print("숫자를 입력하세요. (중복 허용 X) : ");
			arr1[i] = scan.nextInt();
			for(int j=0; j<i; j++) {
				if (arr1[i] == arr1[j]) {
					System.out.println("중복입니다. 다시 입력하세요");
					i--;
					break;
				}
			}
			System.out.println(Arrays.toString(arr1));
		}
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		System.out.println();
		
		
		// 숫자를 입력받아서 8개의 공간 채우기
		// 중복은 2개까지만 허용
		int arr2[] = new int[8];	// 5개의 공간을 받을 배열 생성
//		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr2.length; i++) {
			// 입력
			System.out.print("숫자를 입력하세요. (중복 2개 허용) : ");
			arr2[i] = scan.nextInt();
			int cnt = 0;	// 중복을 체크하기 위한 변수
			for(int j=0; j<i; j++) {
				if (arr2[i] == arr2[j]) {
					cnt++;
					if (cnt >= 2) {
						System.out.println("중복입니다. 다시 입력하세요");
						i--;
						break;
					}
				}
			}
			System.out.println(Arrays.toString(arr2));
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
	}

}
