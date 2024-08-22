package collection01;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

	static ArrayList<Human> callHuman() {
		Human hong = new Human("홍길동", 30, "서울");
		Human kim = new Human("김철수", 20, "인천");
		Human park = new Human("박영희", 25, "제주");
		
		ArrayList<Human> persons = new ArrayList<>();
		persons.add(hong);
		persons.add(kim);
		persons.add(park);
		
		return persons;
	}
	
	static String callHuman1() {
		return "안녕하세요";
	}
	
	static int[] callArray() {
		int[] arrr = {1, 3, 5, 7, 9};
		return arrr;
	}
	
	static HashMap<String, Object> callPerson(Human hong) {
		// 리턴 타입 : HashMap<key, value>, 파라미터 : 클래스 'Human'의 객체로 받기
		HashMap<String, Object> person = new HashMap<>();
		person.put("name", hong.getName());
		person.put("age", hong.getAge());
		person.put("addr", hong.getAddr());
		
		return person;
	}

}
