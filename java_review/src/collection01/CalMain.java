package collection01;

import java.util.ArrayList;
import java.util.HashMap;

import collection01.CalculatorImp01.Calculator;

public class CalMain {

	public static void main(String[] args) {
		// {num1 : 100, num2 : 20}
		HashMap<String, Object> number = new HashMap<>();
		number.put("num1", 100);
		number.put("num2", 20);
		System.out.println(number);
		
		Calculator calc = new Calculator();
		// 인터페이스에 div 추상메소드 작성 후 오버라이딩해서 구현
		int result = calc.div(number);
		System.out.println(result); 	// 5 출력
		
		ArrayList<Double> list = new ArrayList<>();
		list.add(100.5);
		list.add(11.3);
		
		double result2 = calc.minus(list);
		System.out.println(result2); 	// 89.2 출력
	}

}
