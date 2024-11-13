package secure;

import java.util.Arrays;

public class Calc {
	// 클래스 "Method02"와 연동
	public int sum(int x, int y) {
		// 정수형 리턴 타입 메소드 sum()
		// 인자값 2개 전달
		return x+y;
	}
	
	public int arraySum(int arr[]) {
		// 정수형 리턴 타입 메소드 arraySum()
		// 배열을 받는 파라미터값 : 'int[] arr' or 'int arr[]'		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
