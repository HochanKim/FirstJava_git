package day04_0620;

public class Practice09 {

	public static void main(String[] args) {
		// 향상된 for문을 이용해서 '양수'들의 평균을 구하세요, 소수점까지
		int arr[] = {10, 30, -5, -8, 16};
		int sum = 0;
		int cnt = 0;	// 배열 속 양수들의 수를 저장하기 위한 변수 cnt
		
		for (int plus : arr) {
			// 주어진 배열(arr[])에 접근하여 정수형 변수 plus에 대입
			if (plus > 0) {
				sum += plus;
				cnt++;	// 배열 속 양수들의 개수 세는 증감
			}
		}
		System.out.println((double)sum / cnt);
	}

}
