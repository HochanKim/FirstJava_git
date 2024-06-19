package day03_0619;

public class While02 {

	public static void main(String[] args) {
		// while문으로 구구단 만들기
		int i = 2;
		while (i <= 9) {
			// i = 2
			int j = 1;	// 안에 while문 반복을 위한 변수 j 위치
			System.out.println("== "+i+"단 ==");
			while (j <= 9) {
				System.out.println(i+ "*" +j+ "=" +(i*j));
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
