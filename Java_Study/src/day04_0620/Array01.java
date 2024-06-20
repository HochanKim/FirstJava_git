package day04_0620;
import java.util.Arrays;	// 배열 기능 가져오

public class Array01 {

	public static void main(String[] args) {
		// 배열(Array)
		int[] num = new int[3];		// [0, 0, 0]	
		// 저장공간 3개의 변수가 만들어짐 => [num[0], num[1], num[2]] (배열선언으로 만들어진 저장공간)
		num[0] = 5;		// [5, 0, 0]
		num[2] = 1;		// [5, 0, 1]
		
		System.out.println(num[0]);
		System.out.println(Arrays.toString(num));
	}

}
