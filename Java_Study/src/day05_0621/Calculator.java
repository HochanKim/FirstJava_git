package day05_0621;

// 계산기 클래스 생성
public class Calculator {
	// 메소드 이름 : sum, 2개의 int형 숫자를 받아서 더해주기
	int sum(int x, int y){
		System.out.println(x+" + "+y+" = (입력한 두 수의 합은) "+(x+y));
		return x+y;		// 값을 반환하기 위해서는 데이터 타입(문자, 정수 등)을 'void' 자리에 넣는다
	}
}
