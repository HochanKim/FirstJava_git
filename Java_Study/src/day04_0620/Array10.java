package day04_0620;

import java.util.Scanner;
import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		// 크기가 5인 배열을 만들고 5개의 숫자를 직접 입력해서 배열을 채우기
		// 그 중 가장 큰 숫자와 작은 숫자의 위치 바꾸기
		// 중복된 숫자는 입력하지 않는다고 가정
		Scanner scan = new Scanner(System.in);	// 객체 스캐너 선언
		int arr[] = new int[5];		// 객체 배열 선언 및 크기가 5인 배열 생성
		int minIndex = 0;
		int maxIndex = 0;
		
		for (int i=0; i<arr.length; i++) {
			System.out.println((i+1)+"번째로 넣을 숫자를 입력하시오 : ");
			int number = scan.nextInt();
			arr[i] = number;
			
			if (arr[i] > arr[maxIndex]) {	// 배열 인덱스 숫자 조건 (가장 큰 수가 속한 배열 인덱스 번호)
				maxIndex = i;
			}
			if (arr[i] < arr[minIndex]) {	// 배열 인덱스 숫자 조건 (가장 작은 수가 속한 배열 인덱스 번호)
				minIndex = i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println(minIndex);
		System.out.println(maxIndex);
		System.out.println();
		
		int out = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = out;
		System.out.println(Arrays.toString(arr));
	}
}
