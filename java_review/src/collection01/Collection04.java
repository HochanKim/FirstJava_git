package collection01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Collection04 {

	public static void main(String[] args) {
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주");
		
		ArrayList<Human> hList = new ArrayList<>();
		hList.add(hong);
		hList.add(kim);
		hList.add(park);
		
		Human human = Test.maxAge(hList);
		// 리턴 타입 클래스 'Human', 파라미터 타입 'ArrayList<>'
		// human에 나이가 가장 많은 사람의 객체가 담기게 maxAge 구현
	}

}
