package day04_0620;

import java.util.Arrays;

public class Practice08 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 2, 1};
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			} 
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println(maxIndex);	// 2
		System.out.println(minIndex);	// 4
		
		// 배열 숫자 바꾸기
		int temp = arr[minIndex];	// 변수 temp에 1을 대입 (가장 작은 값 저장)
		arr[minIndex] = arr[maxIndex];	// {3, 4, 5, 2, 5}
		arr[maxIndex] = temp;		// {3, 4, 1, 2, 5}
		System.out.println(Arrays.toString(arr));
	}

}
