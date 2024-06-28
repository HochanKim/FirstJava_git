package day91_before;

public class If_exam04 {

	public static void main(String[] args) {
		// 나이가 20 이상이면서 홀수일 경우 "안녕하세요" 출력
		int age = 31;
		if (age >= 20) {
			if (age % 2 == 1) { 
				System.out.println("안녕하세요");
			} else {
				System.out.println("Hello");
			}
		} else {
			System.out.println("ㅎㅇ");
		}
		// AND(&&) (둘 다 만족할때 참), OR(||) (둘 중 하나가 만족해도 참)
		age = 24;
		if (age >= 20 && age % 2 == 1) {
			System.out.println("안녕하세요");
		} else if (age >= 20) {
			System.out.println("Hello");
		} else {
			System.out.println("ㅎㅇ");
		}
	}
	
}
