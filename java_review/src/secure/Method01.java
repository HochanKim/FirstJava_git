package secure;

public class Method01 {
	public static void printHello() {
		// 새로운 메소드 생성 (메소드명 : 'printHello()')
		System.out.println("Hello");
	}
	
	public static String returnHello() {
		// 리턴타입이 설정된 메소드 (메소드명 : 'returnHello()')
		return "return Hello";
	}
	
	public static String returnStr(String str) {
		// 메소드명 : 'returnStr()'
		// 파라미터로 받은 텍스트 + "을(를) 리턴합니다." 
		return str + "을(를) 리턴합니다.";
	}

	public static void main(String[] args) {
		// 함수(function) a.k.a 메소드
		printHello();
		System.out.println(returnHello());
		System.out.println();
		// str => "안녕"을(를) 리턴합니다."로 호출
		String str = returnStr("안녕");
	}

}
