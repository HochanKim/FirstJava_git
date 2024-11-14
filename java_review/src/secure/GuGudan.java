package secure;

import java.util.*;

public class GuGudan {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		// 맞춘 문제 개수 변수
		int count = 0;
		
		for(int i=0; i<5; i++) {
			int num1 = ran.nextInt(8)+2;	// 2~9
			int num2 = ran.nextInt(9)+1;	// 1~9
			System.out.print(num1 + " * " + num2 + " = ");
			// 답변 변수
			int answer = scan.nextInt();
			if(num1*num2 == answer) {
				System.out.println("정답!");
				count++;
			} else {
				System.out.println("틀렸습니다. 정답은 "+(num1*num2)+"입니다.");
			}
		}
		System.out.println("문제 풀이 끝!");
		System.out.println("점수는 "+(count*20)+ "점");

	}

}
