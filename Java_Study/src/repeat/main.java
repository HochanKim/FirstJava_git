package repeat;

public class main {
	
	
	public static void main(String[] args) {
		// 임의의 배열
		int arr[] = {5, 3, 2, 7, 18, 15};
		
		// 임의의 저장 변수 (가장 큰 값을 담기)
		int max = 0;
		// " (가장 작은 값을 담기)
		int min = arr[0];
		
		// 반복문을 통해 배열의 값을 모두 호출하여 비교하기
		for(int i=0; i<arr.length; i++) {
			// 배열의 인덱스 값 : 'int i=0'
			// 배열의 길이 값보다 작게 (왜 '<='가 아닌 '<'인가? => 배열에 들어있는 값의 수는 6개이지만 인덱스는 0부터 5까지
			// 만약 'i<=arr.length'로 범위를 설정할 경우, 인덱스의 최대값(5)을 넘어가서(6) '범위 오류'를 발생시킴
			// 인덱스값을 1씩 증가하는 증감식 : 'i++'
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		for(int j=1; j<arr.length; j++) {
			if(min > arr[j]) {
				min = arr[j];
			}
		}
		System.out.println("배열에서 가장 큰 값은 "+ max);
		System.out.println("배열에서 가장 작은 값은 "+ min);
		System.out.println(max+min);
		
	}

}
