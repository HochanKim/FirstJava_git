package day08_0626;

public class Calculator implements Calc {

	@Override
	public int sum(int x, int y) {
		// 덧셈 인터페이스를 오버라이드
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// 뺄셈 인터페이스를 오버라이드
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// 곱셈 인터페이스를 오버라이드
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// 나눗셈 인터페이스를 오버라이드
		if (y == 0) {
			System.out.println("0으로 나눌 수 없음");
			return 0;
		}
		return x/y;
	}
	
}
