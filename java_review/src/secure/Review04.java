package secure;

import java.util.Arrays;
import java.util.Scanner;

public class Review04 {

	public static void main(String[] args) {
		// 배열(Array '[]') 
		// 정수만 담는 배열 선언
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		// 배열과 반복문
		for(int i=0; i<arr.length; i++) {
			System.out.print((i+1)+"번째 값 입력 : ");
			arr[i] = scan.nextInt();
			// 음수가 입력되면 다시 입력받기
			if(arr[i] < 1) {
				System.out.println("0이하 수는 입력할 수 없음. 다시 입력하길 바람");
				i--;	// 배열의 인덱스 값을 감소시키고 반복문 시작으로 돌려보냄
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
