package special;
import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// 배열
		int arr[] = {3, 5, 2, 4, 1};	// 배열 리스트
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		System.out.println(min+", "+max);
	}
}
