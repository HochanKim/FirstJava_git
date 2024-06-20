package day04_0620;

public class Array07 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 1, 2};
		// 가장 작은 수 찾기
		int min = arr[0];	// 배열에서 가장 작은 값을 저장하기 위한 변수 min 선언 (초기값 arr[0])
		for (int i=1; i<arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("배열에서 가장 작은 값 = "+min);
	}

}
