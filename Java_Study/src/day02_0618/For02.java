package day02_0618;

public class For02 {

	public static void main(String[] args) {
		// 이중 for문
		int i;	// 변수 i 설정
		for (i=2; i<=9; i++) {	// 이중 for문, 구구단 작성을 위한 첫 번째 for문
			// 선언문 : 변수 i에 2를 대입
			// 조건문 : 2 이상 9 이하의 범위를 설정
			// 증감식 : 덧셈 (1씩 증가)
			System.out.println("= "+i+"단 =");
			
			for (int j=1; j<=9; j++) { // 이중 for문, 구구단 작성을 위한 두 번째 for문
			// 선언문 : 앞에서 선언한 변수 i의 수와 곱셈을 위한 변수 j 설정 및 1을 대입
			// 조건문 : 1 이상 9 이하의 범위를 설정
			// 증감식 : 덧셈 (1씩 증가)
			System.out.println(i+" X "+j+" = "+(i*j));	// 각각 범위에 맞는 변수 i와 j의 값을 받고 곱셈연산 후 출력
			}
		}
	}
}
