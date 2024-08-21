package collection01;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection02 {

	public static void main(String[] args) {
		// 홍길동, 30, 서울
		// 김철수, 20, 인천
		// 박영희, 25, 제주
		
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주");
		
		ArrayList<Human> people = new ArrayList<>();
		people.add(hong);
		people.add(kim);
		people.add(park);
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 hong, kim, park 3개의 객체를 받기
		// 그 결과를 ArrayList에 저장
//		ArrayList<Human> list = Test.callHuman();
		
		// Test 클래스에 있는 callHuman 메소드 호출
		// 리턴으로는 문자열 "안녕하세요"
//		String str = Test.callHuman();
	}

}
