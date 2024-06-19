package day2_before;

public class If_exam03 {

	public static void main(String[] args) {
		// if ~ else if
		int score = 100;
		
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {	// else if로 다중조건 적용
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("낙제");
		}
	}

}
