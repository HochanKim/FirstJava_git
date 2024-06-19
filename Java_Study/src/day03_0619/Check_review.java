package day03_0619;

public class Check_review {

	public static void main(String[] args) {
		int i = 1;	// 구구단의 변수 i 설정 (i단)
		int j;	// 구구단에서 i와 곱해질 변수 j 설정
		while (i < 9) {
			i++;	// 변수 i에 증감식 사용 => i범위 1부터 8까지에 '+1' 효과 => 2부터 9까지 범위 설정
			if (i % 4 == 0 || i % 8 == 0) {
				continue;
			}
			System.out.println("== "+i+"단== ");
			for (j=1; j < 10; j++) {	// 변수 j는 1이상 10미만 설정 (1~9)
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
