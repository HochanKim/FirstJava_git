package day05_0621;
//	4. int arr[] = {3, 5, 1, 8, 2}	 
//	위 배열에서 홀수들의 합과 짝수들이 합의 차이를 구하시오.

public class Test_04 {

	public static void main(String[] args) {
		int arr[] = {3, 5, 1, 8, 2};	 	// 배열 함수 설정
		int odd = 0;						// 조건문을 통해 걸러진 홀수를 저장하기 위한 변수 'odd' 설정
		int sum = 0;						// 조건문을 통해 걸러진 수들을 합하기 위한 변수 'sum' 설정
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] % 2 == 1) {
				odd = arr[i];
				sum = sum + odd;
			}
		}
		System.out.println(sum);
	}
}
