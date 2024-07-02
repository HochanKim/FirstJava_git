package day12_0702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class FruitStore {

	public static void main(String[] args) {
		// 값 입력
		Scanner scan = new Scanner(System.in);
		ArrayList <HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			// 정보 보관
			HashMap<String, Object> map = new HashMap<>();
			
			System.out.println("== (1)과일 추가 (2)판매 (3)개수확인 (그외)종료 ==");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			
			if(menu == 1) {
				System.out.print("과일명 : ");
				map.put("name", scan.next());
				
				System.out.print("가격 입력 : ");
				for(;;) {
					int price = scan.nextInt();
					if (scan.nextInt() < 0) {
						System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
						continue;
					}
					map.put("price", price);
				}	
				
//				System.out.print("개수 입력 : ");
//				map.put("num", scan.nextInt());
//				list.add(map);
				
			} else if(menu == 2) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				System.out.print("개수 입력 : ");
				int inputNum = scan.nextInt();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(name.equals(name)) {
						int num = (int) list.get(i).get("num");
						list.get(i).put("num", (num - inputNum));
						System.out.println("판매되었습니다.");
						System.out.println(name +"의 현재 남은 개수는 "+ (num - inputNum) +"개 입니다.");
					}
				}
			} else if(menu == 3) {
				System.out.print("과일명 : ");
				String inputName = scan.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(name.equals(name)) {
						int num = (int) list.get(i).get("num");
						System.out.println(name +"의 현재 남은 개수는 "+ num +"개 입니다.");
					}
				}
			} else {
				System.out.println("종료!");
				break;
			}
		}
	}
}
