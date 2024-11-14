package secure;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		// 1.
		TestClass testClass = new TestClass();
		testClass.info(); // 출력 결과 : '테스트 클래스 입니다.'

		// 2.
		int arr[] = testClass.getArr();
		System.out.println(Arrays.toString(arr)); 
		// 출력 결과 : [3, 5, 2, 1, 4]

		// 3. 
		String str = testClass.sumArr(arr, 1, 3);
		System.out.println(str);
		// 출력 결과 : '배열의 1, 3 번째 인덱스 값의 합은 6 입니다.'
		// ([3, 5, 2, 1, 4] 배열에서 1,3 번째 인덱스 값의 합을 의미)

	}

}
