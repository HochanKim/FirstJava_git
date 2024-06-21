package day05_0621;
// 3. 구구단을 하시오. 단, 2번째 오는 숫자를 거꾸로(9부터 1까지) 출력하시오.

public class Test_03 {

	public static void main(String[] args) {
		// 반복문 작성
		for (int i=2; i<=9; i++) {	// 구구단의 단 범위설정 (2부터 9까지)
			System.out.println();	// 단 나누기 위한 줄바꿈
			for (int j=9; j>=1; j--) {
				// 구구단의 단과 같이 곱셈할 수 범위 설정 (9부터 역순으로 1까지 계산하여 출력)
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}

	}
}
