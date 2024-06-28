package day10_0628;
// Test 문제

public class ParentClass_Main {

	public static void main(String[] args) {
		// 객체 p 생성
		ParentClass p = new ParentClass("홍길동");	// 파라미터 : 문자열 1개
		// gugudan() 메소드 
		p.gugudan(3); // 구구단 3단 출력

		
		// 배열 메소드
		int arr[] = {3, 5 ,2, 4, 1};
		int bigNumber = p.arrBigNum(arr);
		System.out.println("배열에서 가장 큰 수는 " + bigNumber); // 배열에서 가장 큰 수는 5
		
		System.out.println("----------------------------------- \n");
		
		ChildClass c = new ChildClass();
		c.gugudan(6); // 안내 문구 후 6단 출력
		
//		c.objType("안녕"); // 문자열 입니다.
//		c.objType(123); // 정수 입니다.
//		c.objType(p); // 문자나 정수가 아닙니다.

	}

}
