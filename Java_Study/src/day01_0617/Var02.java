package day01_0617;

public class Var02 {

	public static void main(String[] args) {
		// name : 홍길동, age : 30, height : 170.1, 
		// addr : 인천, eventFlag : true
		String name = "홍길동";
		int age = 30;
		double height = 170.1;
		String addr = "인천";
		String addrNum = "30";	// 맨 앞이 '0'으로 시작할 번호들은 문자열로 선언
		boolean eventFlag = true;
		
		System.out.println("회원 이름 : "+ name);
		System.out.println(age + age);	// 숫자간 연산
		System.out.println(addrNum + addrNum);	
		// 문자열간 연산 (텍스트 이어붙이기, 수학적 연산이 적용안됨, 덧셈 제외 나머지 연산은 불가능)
		
		System.out.print("나이 : ");	// 줄바꿈 기능('ln') 없앰
		System.out.println(age);
	}

}
