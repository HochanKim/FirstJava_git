package day01_0617;

public class Var01 {

	public static void main(String[] args) {
		/*
		 * 문자열 변수 String
		 * 정수형 변수 int
		 * 실수형 변수 double 
		 * 논리형 변수(참과 거짓 판별) boolean
		 */
		
		String 이름 = "홍길동"; 	// 이름(변수) = 홍길동(대입값);, 문자
		
		int 나이 = 30; 			// 나이 = 30;, 정수
		System.out.println(나이);
		
		double 키 = 182.2;		// 키 = 182.2, 실수
		
		String 주소 = "인천"; 	// 주소 = 인천;, 문자
		System.out.println(주소);
		
		boolean 이벤트동의여부 = false;		// 불리언형 변수, true(참) or false(거짓)
		
		나이 = 나이 + 1;
		주소 = "서울";
		System.out.println(나이);
		System.out.println(주소);
	}

}
