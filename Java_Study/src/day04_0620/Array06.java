package day04_0620;

public class Array06 {

	public static void main(String[] args) {
		int arr[] = {77, 88, 4, 6, 26};	// 참조변수 arr[], 배열로 선언
		// 배열에서 가장 큰 숫자 찾기 (배열에는 양수만 담겨있다)
		// "가장 큰 숫자는 NN입니다." 출력
		int max = arr[0];	// 선언된 배열에서 가장 큰 값을 저장하기 위한 공간인 변수 max 설정 (초기값 arr[0])
		
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {		// 가장 큰 값을 추출하기 위한 조건문
				max = arr[i];		// 변수 max에 가장 큰 값 저장
			}
		}
		System.out.println("가장 큰 숫자는 "+max+"입니다.");
	}

}
