package day02_0618;

public class For_review01 {

	public static void main(String[] args) {
		// 1부터 10까지 숫자의 합
		int sum = 0;	// 변수 sum 선언 (값 초기화)
		int i;	// 변수 i 선언
		for (i=1; i<=10; i++) {
			sum = sum + i;	// sum =+ i
//			System.out.println(sum);	// for문 안에 넣을시 덧셈 총합이 반복되어 출력됨
		}
		System.out.println(sum);
	}

}
