package day05_0621;

public class Class_02 {

	public static void main(String[] args) {
		Calculator calc = new Calculator();	
		// 해당 클래스에 접근하고 new 키워드를 활용하여 객체 'calc' 생성
		
		int a = calc.sum(123456, 541546);		// 클래스에서 값을 반환하여 변수 'a'에 대입
		System.out.println(a);		// 반환값이 담긴 'a'를 출력
		
		int n = calc.sum(3, 6, 9);
		System.out.println(n);
		
		double k = calc.sum(6.21, 11.30);	
		// ※ 클래스에서 설정한 형과 맞지 않으면 반환을 받을수 없다.
		System.out.println(k);
	}

}
