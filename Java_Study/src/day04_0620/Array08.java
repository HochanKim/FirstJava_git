package day04_0620;

import java.util.Arrays;

public class Array08 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 1, 2};
		// ***
		// ****
		// *****
		// *
		// **
		// 배열의 수에 따라 별을 출력하기
		String star = "*";
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i]; j++) {
				// 조건식 : j < arr[i] => 문자를 출력하기 위한 수의 범위를 배열값을 사용
				System.out.print(star);
			}
			System.out.println();
		}
	}
}
