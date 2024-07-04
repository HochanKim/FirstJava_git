package special;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class FruitStore {

	public static void main(String[] args) {
		// 값 입력
		Scanner scan = new Scanner(System.in);
		ArrayList <HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			System.out.println("== (1)과일 추가 (2)판매 (3)개수확인 (그외)종료 ==");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				System.out.print("과일명 : ");
				String fruit = scan.next();
				boolean flag = false;
				
				for(HashMap<String, Object> item : list) {
					if(item.get("fruit").equals(fruit)) {
						flag = true;
						System.out.print("가격 입력 : ");
						int price = scan.nextInt();	// 가격 입력한 값 저장하는 변수
					
						System.out.print("개수 입력 : ");
						int num = scan.nextInt();	// 개수 입력한 값 저장하는 변수
						if(price < 0 || num < 0) {	// 가격이나 개수가 음수로 입력할 경우 조건문
							System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
							continue;
						}
						item.put("price", price);
						item.put("num", num);
						break;
					}
				}
				
				if(flag == false) {
					HashMap<String, Object> map = new HashMap<>();
					System.out.print("가격 입력 : ");
					int price = scan.nextInt();	// 가격 입력한 값 저장하는 변수
							
					System.out.print("개수 입력 : ");
					int num = scan.nextInt();	// 개수 입력한 값 저장하는 변수
					if(price < 0 || num < 0) {	// 가격이나 개수가 음수로 입력할 경우 조건문
						System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
						continue;
					}
					map.put("fruit", fruit);
					map.put("price", price);						
					map.put("num", num);
					list.add(map);
				}
			}
			System.out.println(list);
			
			if(menu == 2) {
				
			}
			
			if(menu == 3) {
				
			}
			
			if(menu < 1 || menu > 3) {
				System.out.println("종료!");
				break;
			}
		}
		scan.close();
	}
}

