package day11_0701;

import java.util.HashMap;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("== (1)입력 (2)검색 (3) 종료 ==");
		System.out.print("메뉴 선택 : ");
		String menu = scan.next();
		HashMap<String, Object> map
						= new HashMap<>();
		if(menu.equals("1")) {
			// 입력 부분 작성
			System.out.print("이름 : ");
			map.put("name", scan.next());
			System.out.print("나이 : ");
			map.put("age", scan.nextInt());
			System.out.print("주소 : ");
			map.put("addr", scan.next());
			System.out.print("핸드폰 : ");
			map.put("phone", scan.next());
			System.out.println(map);
		} else if(menu.equals("2")) {
			// 검색 부분 작성
			System.out.print("검색할 사람 : ");
			String name = scan.next();
			String str = (String) map.get("name");
			if(str.equals(name)) {
				System.out.println("이름 : " + map.get("name"));
				System.out.println("나이 : " + map.get("age"));
				System.out.println("주소 : " + map.get("addr"));
				System.out.println("핸드폰 : " + map.get("phone"));
			} else {
				System.out.println("찾는 사람 없음");
			}
		} else if(menu.equals("3")) {
			// break;
		} else {
			System.out.println("1~3중에 하나 선택하쇼");
		}
	}
}
