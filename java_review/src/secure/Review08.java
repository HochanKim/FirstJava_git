package secure;

import java.util.Arrays;

public class Review08 {

	public static void main(String[] args) {
		// 배열
		int arr[] = {-2, 1, 5, 4, 3};
		
		// 가장 큰 숫자와 가장 작은 숫자의 위치 변경
		// {2, 1, 5, 4, 3} => {2, 5, 1, 4, 3}
		
//		int max = arr[0];
//		int min = arr[0];
//		
//		int maxIndex = 0;
//		int minIndex = 0;
//		for(int i=1; i<arr.length; i++) {
//			// 배열에서 가장 큰 수와 큰 수의 위치(인덱스)
//			if(arr[maxIndex] < arr[i]) {
//				max = arr[i];
//				maxIndex = i;
//			}
//			
//			// 배열에서 가장 작은 수 와 작은 수의 위치(인덱스)
//			if (arr[minIndex] > arr[i]) {
//				min = arr[i];
//				minIndex = i;
//			}
//		}
//		
//		System.out.println("가장 큰 수 : "+max);
//		System.out.println("max의 인덱스 위치 : "+maxIndex);
//		System.out.println();
//		System.out.println("가장 작은 수 : "+min);
//		System.out.println("min의 인덱스 위치 : "+minIndex);
//		System.out.println();
//		// 큰 수와 작은수의 위치 변경
//		arr[minIndex] = max;
//		arr[maxIndex] = min;
//		System.out.println("큰 수와 작은 수의 위치변경 배열값 : "+Arrays.toString(arr));
		
		int maxIndex = 0;
		int minIndex = 0;
		for(int i=1; i<arr.length; i++) {
			// 배열에서 가장 큰 수와 큰 수의 위치(인덱스)
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
			
			// 배열에서 가장 작은 수 와 작은 수의 위치(인덱스)
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		System.out.println("max의 인덱스 위치 : "+maxIndex);
		System.out.println("min의 인덱스 위치 : "+minIndex);
		
		// 큰 수와 작은수의 위치 변경
		int temp = arr[minIndex];
		arr[minIndex] = arr[maxIndex];
		arr[maxIndex] = temp;
		System.out.println("큰 수와 작은 수의 위치변경 배열값 : "+Arrays.toString(arr));
	}

}
