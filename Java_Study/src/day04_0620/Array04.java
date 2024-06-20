package day04_0620;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		int arr[] = {30, 5, 7, 90, 93, 452, 23};
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			sum = sum + arr[i];
		}
		System.out.println();
		System.out.println("주어진 배열의 총 합 = "+sum);
	}

}
