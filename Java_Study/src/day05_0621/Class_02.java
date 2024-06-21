package day05_0621;

import java.util.Scanner;

public class Class_02 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();		// 해당 클래스에 접근하고 new 키워드를 활용하여 객체 'calc' 생성
		int a = calc.sum(123456, 541546);		// 클래스에서 값을 반환하여 변수 'a'에 대입
		System.out.println(a);		// 반환값이 담긴 'a'를 출력
	}

}
