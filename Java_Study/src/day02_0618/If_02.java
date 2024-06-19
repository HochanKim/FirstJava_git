package day02_0618;

public class If_02 {

	public static void main(String[] args) {
		// 정수형 변수 설정
		int score = 95;
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
