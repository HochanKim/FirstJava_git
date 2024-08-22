package collection01;

import java.util.ArrayList;
import java.util.HashMap;

public interface CalculatorImp01 {
	// 숫자 2개를 받고 더해서 리턴해주는 추상메소드 작성
	public int sum(int x, int y);
	
	// 숫자 2개를 받고 곱해서 리턴해주는 추상메소드 작성
	public int mul(int x, int y);
	
	// 파라미터로 해시맵을 받고 나눗셈을 리턴해주는 추상메소드 작성
	public int div(HashMap<String,Object> map);
	
	// 파라미터로 어레이리스트를 받고 빼기를 리턴해주는 추상메소드 작성
	public double minus(ArrayList<Double> list);
	
	
	
	// Calculator 클래스를 만들어서 해당 인터페이스 상속받아서 구현
	public class Calculator implements CalculatorImp01 {
		// 상속받은 추상메소드를 재정의
		@Override
		public int sum(int x, int y) {
			return x + y;
		}
		
		@Override
		public int mul(int x, int y) {
			return x * y;
		}
		
		@Override
		public int div(HashMap<String,Object> map) {
			int x = (int) map.get("num1");
			int y = (int) map.get("num2");
			return x / y;
		}

		@Override
		public double minus(ArrayList<Double> list) {
			double x = (double) list.get(0);
			double y = (double) list.get(1);
			return x - y;
		}

			
	}
}
