package day11_0701;

import java.util.Vector;	// 클래스 'Vector' 기능 가져오기

public class Vector01 {

	public static void main(String[] args) {
		// 벡터 컬렉션
		Vector<String> vector = new Vector<String>();	// 문자열(String)을 관리하는 리스트
		
		vector.add("자바");				// 0번째 인덱스 값
		vector.add("오라클");				// 1번째 인덱스 값
		vector.add("html/css");			// 2번째 인덱스 값
		vector.add(2, "자바스크립트"); 	// 2번째 자리에 "자바스크립트" 값 입력 ("오라클"과 "html" 사이)
		// [자바, 오라클, 자바스크립트, html/css]
//		System.out.println(vector.get(1)); 		// 1번째 값 "오라클" 출력
		
		for (int i=0; i<vector.size(); i++) {
			System.out.println(vector.get(i));
		}
	}
}
