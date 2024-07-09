package day02_0618;

public class For_review05 {

	public static void main(String[] args) {
		// 특정 단 제외 구구단 출력 (continue 활용)
		int i;
		int j;
		for (i = 2; i < 10; i++) {
			System.out.println("== " + i + "단 ==");
			if (i == 5) {	// 5단 제외를 위한 조건문 설정
				continue;	// 5단 제외하고 나머지 단 출력
			}
			
			// 구구단 출력
			for (j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
}
