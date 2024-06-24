package day05_0621;

/*

6. int arr[] = {3, 5, 1, 8, 2}
위 배열에서 3이상의 숫자들에 대한 평균 값을 구하시오. 

*/

public class Test_06 {

	public static void main(String[] args) {
		int arr[] = {3, 5, 1, 8, 2};
		int sum = 0;	
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] >= 3) {	// 배열에서 3이상의 숫자를 분류하기 위한 조건문
				sum = sum + arr[i];		// 3이상의 숫자들 합계
			}
		}
		System.out.println(sum);	// 3 + 5 + 8 = 16
	}

}
