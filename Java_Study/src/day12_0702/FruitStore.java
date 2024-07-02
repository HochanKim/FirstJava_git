package day12_0702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FruitStore {

	public static void main(String[] args) {
		// 값 입력
		Scanner scan = new Scanner(System.in);
		ArrayList <HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			// 정보 보관
			HashMap<String, Object> map = new HashMap<>();
			int menu = 0;
			
			// 예외처리
			for(;;) {
				System.out.println("== (1)과일 추가 (2)판매 (3)개수확인 (그외)종료 ==");
				System.out.print("메뉴 선택 : ");
	            try {
	            	menu = scan.nextInt();
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("[ERROR] 숫자를 입력해주세요.");
	                continue;
	            }
			}
			
			
			if(menu == 1) {	// 조건문 1
				System.out.print("과일명 : ");
				map.put("name", scan.next());
				
				// 특정 조건 반복문 실행
				for(;;) {
					System.out.print("가격 입력 : ");
					int price = scan.nextInt();
					if(price < 0) {
						System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
						continue;	// 음수 입력시 for문 반복 1
					}
					map.put("price", price);
					for(;;) {
						System.out.print("개수 입력 : ");
						int num = scan.nextInt();
						if(num < 0) {
							System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
							continue;	// 음수 입력시 for문 반복2 
						}
						map.put("num", num);
						list.add(map);
						break;	// 입력 만족시, for문 나가기 1
					}
					break;	// 입력 만족시, for문 나가기 2
				}
				continue;	// while문 처음으로 돌아가기
			}
				
			
			if(menu == 2) { // 조건문 2
				System.out.print("과일명 : ");
				String inputName = scan.next();
				
				// 특정 조건 반복문 실행
				while (true) {
					for(int i=0; i<list.size(); i++) {
						for(;;) {
							System.out.print("개수 입력 : ");
							int inputNum = scan.nextInt();
							if(inputNum < 0) {
								System.out.println("잘못된 입력입니다. (최소 0까지 입력가능)");
								continue;	// 음수 입력시 for문 반복3
							}
							
							String name = (String) list.get(i).get("name");							
							if(name.equals(name)) {
								int num = (int) list.get(i).get("num");
								list.get(i).put("num", (num - inputNum));
								
								// 잘못된 개수 계산시 조건문
								if((num-inputNum) < 0) {
									System.out.println("개수가 부족합니다.");
									list.get(i).put("num", (num - inputNum + inputNum)); 
									// 음수로 계산된 값에 입력값을 다시 더해서 해당 키의 값(value)을 원복하기
									continue;
								} else {
									System.out.println("판매되었습니다.");
									System.out.println(name +"의 현재 남은 개수는 "+ (num - inputNum) +"개 입니다.");
								}
							}
							break;
							
						}
						break;
					}
					break;
				}
				continue;
			} 
			
			if(menu == 3) { // 조건문 3
				System.out.print("과일명 : ");
				String inputName = scan.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					if(name.equals(name)) {
						int num = (int) list.get(i).get("num");
						System.out.println(name +"의 현재 남은 개수는 "+ num +"개 입니다.");
					}
				}
			} 
			
			else {	// else (1~3 이외 번호 입력시)
				System.out.println("종료!");
				break;
			}
		}
	}
}
