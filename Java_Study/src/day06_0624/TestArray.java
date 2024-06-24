package day06_0624;

import java.util.Arrays;

/*
1. 클래스명 TestArray인 클래스를 작성하시오.

2. changeArray 메소드를 생성하고 아래 조건에 맞게 구성하시오.
 조건 1) 정수형 배열을 매개변수로 받을 것.
 조건 2) 해당 배열의 가장 큰 값과 가장 작은 값의 위치를 변경할 것
 조건 3) static으로 선언하고 리턴은 없도록 할 것

3. 메인 메소드에서 아래와 같이 배열을 만들고 changeArray 메소드를 호출하여 
변경된 배열의 결과를 출력하시오.
(배열 : arr[] = {2,5,3,1,4})

4. 2번의 메소드가 리턴이 필요없는 이유에 대해 논리적으로 생각해보시오.
*/

public class TestArray {
//	static int temp = 0;
//	static int arr[] = {2,5,3,1,4};
//	static void changeArray(int arr[]) {
//		temp = arr[3];
//		arr[3] = arr[1];
//		arr[1] = temp;
//	}
	static void changeArray(int arr[]) {
		int maxIndex = 0;
		int minIndex = 0;
		
		for (int i = 1; i<arr.length; i++) {
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			} 
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		// arr[] = {2,5,3,1,4}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
	}
}
