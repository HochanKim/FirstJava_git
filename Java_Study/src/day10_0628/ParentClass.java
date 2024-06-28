package day10_0628;
// Test 문제

public class ParentClass {
	// 필드 선언 (변수)
	private String name;
	private int x;
	private int arr[];
	
	// 기본 생성자
	ParentClass () {}
	
	// 생성자 작성
	ParentClass (String name) {
		// ParentClass p = new ParentClass("홍길동");
		this.name = name;
		System.out.println(this.name+"님 자바 클래스 테스트를 시작합니다!");
	}
	
	// 메소드 작성 'p.gugudan(3);'
	void gugudan(int x) {
		this.x = x;
		for (int i=this.x; i<=this.x; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(this.x+" * "+j+" = "+(this.x*j));
			}
		}	 
	}
	
	// 메소드 작성 'int bigNumber = p.arrBigNum(arr);'
	int arrBigNum(int[] arr) {
		int max = arr[0];
		int maxIndex = 0;
		maxIndex++;
		// int arr[] = {3, 5 ,2, 4, 1}
		if (max < arr[maxIndex]) {
			max = arr[maxIndex];
		}
		return max;	// 'p.arrBigNum(arr)'에 값을 반환
	}
	
	@Override
	public String toString() {
		return null;
	}


}
