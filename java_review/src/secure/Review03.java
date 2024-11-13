package secure;

public class Review03 {

	public static void main(String[] args) {
		// 배열과 반복문
		int arr[] = {1, 3, 5, 2, 4};
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//			for(int j=0; j<arr[i]; j++) {
//				System.out.print("*");
//			}
//		}
		
		for(int i=0; i<arr.length; i++) {			
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println();	// 줄바꿈
		}
		
	}
}
