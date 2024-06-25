package day06_0624;

import java.util.Arrays;

public class TestArray_main {

	public static void main(String[] args) {
//		TestArray chg = new TestArray();
//		
//		System.out.println(Arrays.toString(arr));
		int arr[] = {2,5,3,1,4};
		TestArray.changeArray(arr);		// 클래스 'TestArray' 내 메소드 'changeArray' 호출
		System.out.println(Arrays.toString(arr));

	}

}
