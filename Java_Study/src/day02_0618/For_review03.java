package day02_0618;

public class For_review03 {

	public static void main(String[] args) {
		// break문과 continue문
		// break
		// 조건에 맞는 수가 나올시 이전 숫자까지 출력하고 반복문에서 빠져나옴
		for (int i = 1; i <=10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println(i);
			// 출력값 => 1 2 3 4
		}
		System.out.println();
		
		// continue
		// 조건에 맞는 수가 나올시 그 숫자를 제외하고 범위내 숫자를 모두 반복하고 종료
		for (int j = 1; j <=10; j++) {
			if(j == 7) {
				continue;
			}
			System.out.println(j);
			// 출력값 => 1 2 3 4 5 6 8 9 10
		}
	}

}
