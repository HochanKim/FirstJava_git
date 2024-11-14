package secure;

public class TestClass {
	
	// 1.
	// 메소드 'info()' 생성
	public static void info() {
		System.out.println("테스트 클래스 입니다.");
	}
	
	// 2.
	// 메소드 'getArr()' 생성
	public static int[] getArr() {
		int arr[] = {3, 5, 2, 1, 4};
		return arr;
	}
	
	// 3.
	// 메소드 'sumArr(파라미터값)' 생성
	public static String sumArr(int[] arr, int x, int y) {
		int sum = (arr[x] + arr[y]);
		return "배열의 "+x+", "+y+"번째 인덱스 값의 합은 "+sum+" 입니다.";
	}
	
}
