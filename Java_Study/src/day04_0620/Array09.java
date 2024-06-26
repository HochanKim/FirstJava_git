package day04_0620;

public class Array09 {

	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 1, 2};
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		System.out.println("가장 큰 수가 있는 인덱스 : arr["+maxIndex+"]");
		System.out.println("가장 작은 수가 있는 인덱스 : arr["+minIndex+"]");
	}

}
