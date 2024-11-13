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
	
	static Human maxAge(ArrayList<Human> list) {
		Human oldest = list.get(0); // 리스트의 첫 번째 요소를 연장자로 초기화 (객체 'oldest' 생성)
		
		for(int i=1; i<list.size(); i++) {
			Human person = list.get(i);	// 리스트의 요소들을 리스트에 담겨진 수만큼 반복 (반복하여 검색한 요소들을 담기 위한 객체 'person' 생성)
			
			if(person.getAge() > oldest.getAge()) {
				// 객체 'oldest'와 객체 'person'의 요소들의 나이를 비교하기 위한 조건
				// 가장 나이가 많은 객체는 'oldest'에 대입하여 반환
				oldest = person;
			 }
		}
		return oldest;	// 가장 나이가 많은 요소를 반환
    }
}
