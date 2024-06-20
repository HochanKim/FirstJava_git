package day04_0620;

import java.util.Scanner;
import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		int arr[] = new int[5];	// 배열 선언
		Scanner scan = new Scanner(System.in);	// 스캐너 클래스 선언
		
		for(int i=0; i<arr.length; i++) {	// 'i'는 배열의 인덱스 번호를 받는 변수
			System.out.println((i+1)+"번째 숫자를 입력해 주세요 : ");
			arr[i] = scan.nextInt();	// 위에서 입력한 수를 선언한 배열에 순차적으로 대입
			if (arr[i] < 0) {
				System.out.println("0보다 큰 수만 입력하세요");
				i--;
			}
		}
		System.out.println(Arrays.toString(arr));
		
//		int i;
//		for (i=1; i<=5; i++) {
//			System.out.println(i+"번째 숫자를 입력해 주세요 : ");
//			int num = scan.nextInt();
//			for (int j=0; j<arr.length; j++) {
//				arr[j] = num;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
	}

}
