package day05_0621;

public class Temp {

	public static void main(String[] args) {
		// 여러가지 배열
//		String str[] = new String[3];	// 문자열 배열
//		str[0] = "안녕";
		String str[] = {"금요일", "신난다", "게임해야지"};
		for (int i = 0; i < str.length; i++) {	// for문 출력
			System.out.println(str[i]);
		}
		System.out.println();
		
		for (String txt : str) {	// 향상된 for문 출력
			System.out.println(txt);
		}
	}

}
