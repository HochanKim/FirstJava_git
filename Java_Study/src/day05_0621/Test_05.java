package day05_0621;
/*
5. int arr[] = {3, 5, 1, 8, 2}
위 배열에서 가장 작은 숫자를 찾아서 맨 처음 위치의 숫자와 위치를 바꾸시오
*/

import java.util.Arrays;

public class Test_05 {

	public static void main(String[] args) {
		int arr[] = {3, 5, 1, 8, 2};
		int maxIndex = arr[0];			// 배열에서 가장 큰 수의 인덱스
		int minIndex = arr[0];			// 배열에서 가장 작은 수의 인덱스
		int max = 0;					// 배열에서 가장 큰 수의 배열 위치 번호 
		int min = 0;					// 배열에서 가장 작은 수의 배열 위치 번호
		int i = 0;						// 배열의 인덱스를 저장한 변수 'i'
		
		// 배열의 수를 출력하기 위한 반복문
		for (i=0; i<arr.length; i++) {
			// 가장 큰 수를 골라내기 위한 조건문
			if (arr[i] > maxIndex) {
				maxIndex = arr[i];	// 가장 큰 수
				max = i;			// 가장 큰 수가 위치한 배열 인덱스 번호
			}
			// 가장 작은 수를 골라내기 위한 조건문
			if (arr[i] < minIndex) {
				minIndex = arr[i];	// 가장 작은 수
				min = i;			// 가장 작은 수가 위치한 배열 인덱스 번호
			}
		}
		System.out.println("가장 큰 수 : "+maxIndex);
		System.out.println("가장 작은 수 : "+minIndex);
		
		// 위치 바꾸기
		int out = arr[min];		// 정수 저장공간인 변수 'out'을 지정하여 가장 작은 수를 보관
		arr[min] = arr[max];	// 가장 작은 수의 자리에 가장 큰 수를 저장
		arr[max] = out;			// 가장 큰 수의 자리에 변수 'out'에 대입한 가장 작은 수를 저장
		System.out.println(Arrays.toString(arr));	// [3, 5, 8, 1, 2]
	}

}
