package day04_0620;

public class Array11 {

	public static void main(String[] args) {
		int arr[] = {11, 15, 55, 85, -3};
		// for (int i = 0; i < arr.length; i++) {
		//		System.out.println(arr[i]);
		//	}
		// 향상된 for문
		int sum = 0;
		for (int num : arr) {	
			// 배열에 있는 값들을 순차적으로 접근하여 변수 num에 대입
			sum += num;
		}
		int a = (int) 10.5;		// 형 변환 예시 : 변수 = (바꾸고자 하는 형) 원형	
		System.out.println(a);
		System.out.println(sum);	// 배열의 합계
		System.out.println((double)sum / arr.length);	// 배열의 평균, 정수형 변수 sum을 실수형(double)으로 변환
	}

}
