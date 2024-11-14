package secure;

import java.util.*;

public class GugudanBrake {

	public static void main(String[] args) {
		// 클래스 'Random' 호출하여 객체('ran') 생성
		Random ran = new Random();
		// 클래스 'Scanner' 호출하여 객체('scan') 생성
		// 객체에 입력하기
		Scanner scan = new Scanner(System.in);
		
		// 맞춘 문제 개수 변수
		int count = 0;
		// 오답 개수 변수
		int mistake = 0;
		
//		for(int i=0; i<5; i++) {
//			int num1 = ran.nextInt(8)+2;	// 2~9
//			int num2 = ran.nextInt(9)+1;	// 1~9
//			System.out.print(num1 + " * " + num2 + " = ");
//			// 답변 변수
//			int answer = scan.nextInt();
//			if(num1*num2 == answer) {
//				System.out.println("정답!");
//				count++;
//			} else {
//				System.out.println("틀렸습니다. 정답은 "+(num1*num2)+"입니다.");
//			}
//		}
		
//		System.out.println("문제 풀이 끝!");
//		System.out.println("점수는 "+(count*20)+ "점");
		
		while(true) {
			// 랜덤 객체 사용한 정수형 변수
			int num1 = ran.nextInt(8)+2;
			int num2 = ran.nextInt(9)+1;
			
			// 문제 (구구단)
			System.out.print(num1 + " * " + num2 + " = ");
			
			// 답변 변수
			int answer = scan.nextInt();
			
			// 정답/오답 체크
			if(answer == num1*num2) {
				count++;
				System.out.println("정답!");
			} else if(answer == -1) {
				break;
			} else {
				mistake++;
				System.out.println("틀렸습니다. 정답은 "+(num1*num2)+"입니다.");
			}
			
			// '-1' 입력시 종료
//			if(answer == -1) {
//				mistake--;	// 오답에 포함안됨
//				break;
//			}		
		}
		
		System.out.println("문제풀이를 종료합니다.");
		System.out.println("정답 : "+count+"개, 오답 :"+mistake);
	}

}
