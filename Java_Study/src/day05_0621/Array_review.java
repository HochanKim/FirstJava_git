package day05_0621;

import java.util.Arrays;
import java.util.Scanner;

public class Array_review {

	public static void main(String[] args) {
		// 크기가 5인 배열을 만들고 5개의 숫자를 직접 입력해서 배열을 채우기
		// 그 중 가장 큰 숫자와 작은 숫자의 위치 바꾸기
		// 중복된 숫자는 입력하지 않는다고 가정
		Scanner scan = new Scanner(System.in);	// 객체 스캐너 선언
		int arr[] = new int[3];		// 객체 배열 선언 및 크기가 3인 배열 생성
		int minIndex = 0;			// 배열에서 가장 작은 수를 저장한 인덱스
		int maxIndex = 0;			// 배열에서 가장 큰 수를 저장한 인덱스
		
		for (int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째로 넣을 숫자를 입력하시오 : ");
			int number = scan.nextInt();
			arr[i] = number;
			
			for (int j=0; j<arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					System.out.print("중복 숫자를 입력했습니다. 새로운 숫자를 입력하세요 : ");
					number = scan.nextInt();
					arr[j] = number;
					j--;
				}
			}
			
			if (arr[i] > arr[maxIndex]) {	// 배열 인덱스 숫자 조건 (가장 큰 수가 속한 배열 인덱스 번호)
				maxIndex = i;	
			}
			if (arr[i] < arr[minIndex]) {	// 배열 인덱스 숫자 조건 (가장 작은 수가 속한 배열 인덱스 번호)
				minIndex = i;	
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		System.out.println("가장 작은 수 : a["+minIndex+"]");
		System.out.println("가장 큰 수 : a["+maxIndex+"]");
		System.out.println();
		
		int out = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = out;
		System.out.println(Arrays.toString(arr));
	}
}
