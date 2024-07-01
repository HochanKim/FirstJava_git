package day11_0701;

import java.util.ArrayList;
import java.util.HashMap;


public class Hashmap01 {

	public static void main(String[] args) {
		// HashMap
		HashMap<String, Object> hong = new HashMap<String, Object>();
		
		hong.put("name", "홍길동");
		hong.put("age", 30);
		hong.put("addr", "인천");
		hong.put("phone", "010-1234-5678");
		System.out.println(hong);
		
		HashMap<String, Object> kim = new HashMap<String, Object>();
		
		kim.put("name", "김철수");
		kim.put("age", 40);
		kim.put("addr", "부천");
		kim.put("phone", "010-1234-1234");
		System.out.println(kim);
		
		HashMap<String, Object> yoo = new HashMap<String, Object>();
		
		yoo.put("name", "유재석");
		yoo.put("age", 50);
		yoo.put("addr", "서울");
		yoo.put("phone", "010-4321-8765");
		System.out.println(yoo);
		
		System.out.println();
		
		// 'ArrayList' 안에 'HashMap' 넣기
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		list.add(hong);
		list.add(kim);
		list.add(yoo);
		System.out.println(list);
	}

}
