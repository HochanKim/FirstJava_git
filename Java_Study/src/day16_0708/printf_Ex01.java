package day16_0708;

public class printf_Ex01 {

	public static void main(String[] args) {
		String name = "홍길동";
		int age = 30;
		System.out.println(name+"의 나이는 "+age+"살 입니다.");
		// printf 사용
		System.out.printf("%s의 나이는 %d살 입니다.", name, age);	// 소수점 %f, 불리언형 %b 등

	}

}
