package secure;

public class Method02 {

	public static void main(String[] args) {
		// 클래스 "Calc"에 선언된 sum 함수를 호출한 결과를 출력
		
		// 클래스 "Calc"를 통한 객체 생성 (객체명 : 'sansoo')
		Calc sansoo = new Calc();
		// 객체를 통한 클래스의 메소드 호출("Calc" 클래스에 선언된 메소드 'sum(파라미터값 : int x, 파라미터값 : int y)')
		int sum = sansoo.sum(5, 2);
		// 결과물
		System.out.println("합계 : "+sum);
		
		int arr[] = {1, 3, 5, 2, 4};
		int arrSum = sansoo.arraySum(arr);
		System.out.println("배열의 총 합 : "+arrSum);
	}

}
