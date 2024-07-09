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
			
			if(menu == 1) {	// 조건문 1
				System.out.print("과일명 : ");
				String fruit = scan.next();
				boolean flag = false;	// 중복 체크를 위한 불형 변수선언
				
				// 특정 조건 반복문 실행
				for(HashMap<String, Object> item : list) {
					if(item.get("fruit").equals(fruit)) {	// 과일명 "fruit"의 중복일 경우 조건
						flag = true;	// 중복 체크를 위한 불형 변수 
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
				
				if(flag == false) {	// 불형 변수에 의한 조건
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
			
			if(menu == 2) { // 조건문 2
				System.out.print("과일명 : ");
				String fruit = scan.next();
				System.out.print("판매 개수 입력 : ");
				int inputNum = scan.nextInt();
				
				// 특정 조건 반복문 실행
				while (true) {
					HashMap<String, Object> map = new HashMap<>();
					for(int i=0; i<list.size(); i++) {
						int num = (int) list.get(i).get("num");
						
						if(inputNum < 0) {	
							System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
							continue;
						}	
						
						if(fruit.equals(map.get("fruit"))) {
							list.get(i).put("num", (num - inputNum));
								
							// 잘못된 개수 계산시 조건문
							if(num-inputNum < 0) {
								System.out.println("개수가 부족합니다.");
								list.get(i).put("num", (num - inputNum + inputNum));
								continue;
							} 
							System.out.println("판매되었습니다.");
							System.out.println(fruit+ "의 현재 남은 개수는 "+ (num - inputNum) +"개 입니다.");
						} 
						break;
					}
					break;
				}
			}
			if(menu == 3) {	// 조건문3
				System.out.print("과일명 : ");
				String fruit = scan.next();
				for(int i=0; i<list.size(); i++) {
					fruit = (String) list.get(i).get("fruit");
					if(fruit.equals(fruit)) {
						int num = (int) list.get(i).get("num");
						System.out.println(fruit+ "의 현재 남은 개수는 "+ num +"개 입니다.");
					}
				}
			}
			if(menu < 1 || menu > 3) {
				System.out.println("종료!");
				break;
			}
		}
		scan.close();
	}
}

