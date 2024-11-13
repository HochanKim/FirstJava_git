package secure;

import java.util.*;
import java.lang.*;
import java.io.*;

public class array {
	// maxNum 함수는 배열을 인자(파라미터)로 받아서
	// 배열에서 가장 큰 숫자를 리턴하는 함수
	public static int maxNum(int arr[]){
		int max = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int arr[] = {2, 3, 1, 5, 4};
		int max = maxNum(arr);
		System.out.println("가장 큰 수는 " + max);
	}
}
