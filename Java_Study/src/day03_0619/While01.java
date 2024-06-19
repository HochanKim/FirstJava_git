package day03_0619;

public class While01 {

	public static void main(String[] args) {
		int i = 1;
		while (true) {
			if (i > 100) {
				break;
			}
//			i++;	// 정수형 변수 i를 먼저 증감한 후 출력 => 2~11
			System.out.println(i);
			i++;	// 순차적 증감 출력 => 1~10
		}
	}
}
