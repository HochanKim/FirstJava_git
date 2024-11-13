package secure;

public class Review07 {

	public static void main(String[] args) {
		// 배열
		int arr[] = {20, -10, 5, -4, -3};
		
		// 배열에서 가장 큰 숫자를 출력 => 변수명 'max'에 저장
		// 배열에서 가장 큰 숫자의 위치(index) 값을 출력 => 변수명 'maxIndex'에 저장
		int max = arr[0];
		int maxIndex = 0;
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("배열의 가장 큰 수 :"+max);
		System.out.println("배열의 가장 큰 수의 위치(인덱스 번호) : "+maxIndex);
	}

}
