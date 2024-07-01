package day11_0701;

public class TestObj_Main {

	public static void main(String[] args) {
		TestObj obj = new TestObj();
		obj.print1(); // "안녕하세요" 출력
		String str = obj.print2();
		System.out.println(str);// "안녕하세요" 출력
		obj.print3("홍길동"); // "홍길동님 안녕하세요" 출력

		String str2 = obj.print4("홍길동");
		System.out.println(str2);// "홍길동님 안녕하세요" 출력

	}

}
