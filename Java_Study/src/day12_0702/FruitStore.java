package day12_0702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;


public class FruitStore {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList <HashMap<String, Object>> list = new ArrayList<>();
		
		while (true) {
			System.out.println("== (1)과일 추가 (2)판매 (3)개수확인 (그외)종료 ==");
			System.out.print("메뉴 선택 : ");
			int menu = s.nextInt();
			
			if (menu == 1) {
				// 과일추가
				HashMap<String, Object> map = new HashMap<>();
				boolean isFruit = false;
				
				// 과일명, 가격, 개수를 입력받아 넣기
				System.out.print("과일명 : ");
				String inputName = s.next();
				for(int i=0; i<list.size(); i++) {
					String name = (String) map.get("name");
					// 과일명 중복체크 조건
					if(inputName.equals(name)) {
						isFruit = true;
						System.out.print("개수 : ");
						int inputNum = s.nextInt();
						int num = (int) map.get("num");
						map.put("num", num + inputNum);
					}
				}
				if (!isFruit) {
					map.put("name", inputName);
					System.out.print("가격 : ");
					map.put("price", s.nextInt());
					System.out.print("개수 : ");
					map.put("num", s.nextInt());
				}
				// 여러개의 종류들을 자료저장
				list.add(map);
				
			} else if(menu == 2) {
				// 판매
				System.out.print("과일명 : ");
				String inputName = s.next();
				System.out.print("개수 : ");
				int inputNum = s.nextInt();
				if (inputNum < 0) {
					System.out.println("음수 입력은 안됨");
					continue;
				}
				
				for(int i=0; i<list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					String name = (String) map.get("name");
					// 과일명 중복체크 조건
					if(inputName.equals(name)) {
						int num = (int) map.get("num");
						if (num < inputNum) {
							System.out.println("개수 부족!");
						} else {
							map.put("num", num - inputNum);
							System.out.println("판매되었습니다.");
							System.out.println(name+ "의 현재 남은 개수는 "+ map.get("num") +"개 입니다.");
						}
					}
				}
				
			} else if(menu == 3) {
				// 개수확인
				System.out.print("과일명 : ");
				String inputName = s.next();
				// 저장된 값을 찾기위한 반복문
				for(int i=0; i<list.size(); i++) {
					String name = (String) list.get(i).get("name");
					// 과일명 중복체크 조건
					if(inputName.equals(name)) {
						System.out.println(name+ "의 현재 남은 개수는 "+ list.get(i).get("num") +"개 입니다.");
					}
				}
				
			} else {
				// 종료
				System.out.println("종료!");
				break;
			}
		}
		s.close();
	}
}
