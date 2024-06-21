package day05_0621;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// switch문을 이용한 연산
		Scanner scan = new Scanner (System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = scan.nextInt();
		System.out.print("연산자 : ");
		String cal = scan.next();	//  입력한 연산기호를 받는 공간
		

		switch (cal) {	// 입력받은 연산기호에 맞게 출력하기 위한 case 분기점
		case "+" :
			System.out.println(num1+" + "+num2+" = "+(num1+num2));
			break;
		case "-" :
			System.out.println(num1+" - "+num2+" = "+(num1-num2));
			break;
		case "*" :
			System.out.println(num1+" x "+num2+" = "+(num1*num2));
			break;
		case "/" :
			System.out.println(num1+" ÷ "+num2+" = "+(num1/num2));
			break;
		}
		scan.close();
	}

}
