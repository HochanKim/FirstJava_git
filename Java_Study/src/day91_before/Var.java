package day91_before;

public class Var {
	public static void main(String[] args) {
		String name = "홍길동";
//		String name = "홍철";	// 중복된 지역 변수 이름 => 중복된 이름의 변수 선언으로 인한 에러로 컴파일 불가
		name = "홍철";
		System.out.println(name);
	}

}
