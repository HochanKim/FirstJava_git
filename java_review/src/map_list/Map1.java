package map_list;

import java.util.*;

public class Map1 {

	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1, "자바");
//		map.put(2, "html");
//		map.put(3, "오라클DB");
//		System.out.println(map.get(2));		// 객체 'map'에 넣은 키값으로 밸류값을 가져오기
//		
//		System.out.println();
//		
//		HashMap<String, Object> info = new HashMap<>();
//		info.put("name", "홍길동");	// 맵 or HashMap 객체에 데이터 추가시 '.put(K,V)'
//		info.put("age", 30);
//		info.put("addr", "인천");
//		System.out.println(info);
//		
//		System.out.println();
//		
//		ArrayList<HashMap<String, Object>> listMap = new ArrayList<>();
//		listMap.add(info);	// 리스트 or ArrayList 객체에 데이터 추가시 '.add()'
//		System.out.println(listMap);
		
		Scanner input = new Scanner(System.in);
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=1; i<=3; i++) {
			// 반복문 안 HashMap<> 넣기
			// HashMap의 객체에 입력한 값을 반복하면서 저장
			HashMap<String, Object> person = new HashMap<>();
			
			System.out.println(i+"번째 사람 입력");
			System.out.print("이름 : ");
			person.put("name", input.nextLine());
			
			System.out.print("나이 : ");
			person.put("age", input.nextLine());

			list.add(person);
		}
		System.out.println(list);
	}

}
