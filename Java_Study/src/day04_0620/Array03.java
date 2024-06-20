package day04_0620;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		// 크기가 10인 배열에 1부터 10까지 순서대로 담기
		int arr[] = new int[24];	// [1, 2, 3, ..., 10]
		int num = arr.length;
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(num);
	}

}
