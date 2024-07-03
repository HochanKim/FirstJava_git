package day13_0703_jdbc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lucky_645 {

	public static void main(String[] args) {
		Random random = new Random();				// 객체 'random' 선언
		Scanner scan = new Scanner(System.in);		// 객체 'scan' 선언
		int lucky[] = new int[6];					// 객체 배열 선언 및 크기가 6인 배열 생성
		
		for(int i=0; i<lucky.length; i++) {			// 배열에 값들을 넣기위한 인덱스 범위 설정 (0부터 배열의 최대 크기까지)
			int six = random.nextInt(45) + 1;		// 랜덤 정수 1부터 45까지 범위 설정 ((0 ~ 44) + 1) 
			lucky[i] = six;							// 랜덤 정수를 배열에 차례대로 입력 (0번째부터 설정한 크기까지)
			
			for(int j=0; j<i; j++) {				// 배열 간 비교를 위한 두 번째 반복문 작성
				if (lucky[j] == lucky[i]) {			// 각 배열간 숫자가 중복일때
					i--;							// 중복된 숫자가 들어간 다음 배열의 인덱스를 1씩 차감
					continue;						// 차감된 인덱스의 배열에 새로운 숫자를 출력하기 위해 첫 번째 반복문의 시작으로 돌아가기
				}
			}
			System.out.println(Arrays.toString(lucky));
		}
		Arrays.sort(lucky);		// 무작위로 선정된 정수들의 오름차순 정렬
		System.out.println("오늘의 행운 번호 : "+Arrays.toString(lucky));		// 출력
	}

}
