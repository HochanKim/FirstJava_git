package day91_before;

import java.util.Scanner;

public class If_test03 {

	public static void main(String[] args) {
		/* 	숫자를 1개 입력받아서 80이상일 경우 'A', 60 이상일 경우 'B'
			그 외에는  'C'를 출력. 
			단, 100 초과된 숫자나 음수를 입력했을 경우
			'잘못된 숫자 범위 입니다' 출력 후 종료 		*/
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");
		double score = input.nextDouble();
		if (score > 100 || score < 0) {
			System.out.println("잘못된 숫자 범위입니다.");
		} else if (score >= 80) {
			System.out.println('A');
		} else if (score >= 60) {
			System.out.println('B');
		} else {
			System.out.println('C');
		}
		input.close();
	}

}
