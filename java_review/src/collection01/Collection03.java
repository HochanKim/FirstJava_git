package collection01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Collection03 {

	public static void main(String[] args) {
		// {name : 홍길동, age : 30, addr : 서울}
		// 위 형태의 HashMap 객체 1개 생성
		HashMap<String, Object> hong = new HashMap<>();
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("addr", "서울");
		
		HashMap<String, Object> kim = new HashMap<>();
		kim.put("name", "김철수");
		kim.put("age", 20);
		kim.put("addr", "인천");
		
		HashMap<String, Object> park = new HashMap<>();
		park.put("name", "박영희");
		park.put("age", 25);
		park.put("addr", "제주");
		
		System.out.println(hong);
		System.out.println(kim);
		System.out.println(park);
		
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(park);
		System.out.println(list);
		System.out.println();
		
		// 'list'에서 나이가 25살 이상인 사람의 숫자를 구해서
		// int num에 담으세요
		
		int num = 0;
		for (int i=0; i<list.size(); i++){
			HashMap<String, Object> map = list.get(i);
			int age = (int) map.get("age");
		    if(age >= 25) {
		    	// 'list.get(i).get("age")'는 object 타입
		    	// '(int)' 다운캐스팅
		    	num++;
		    }
		 }
		System.out.println("'list'에서 나이가 25살 이상인 사람의 숫자 : "+num);
		
	}

}
