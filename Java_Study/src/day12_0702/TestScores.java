package day12_0702;
// 사용자 이름, 자바 점수, 오라클 점수, html 점수를 입력받아
// HashMap에 저장하고, 3번 반복하여 ArrayList에 저장하시오

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestScores {
	// 입력 객체 생성
	static Scanner scan = new Scanner(System.in);
	// 점수 범위 함수
	public static Object scoreFunc(String subject, int max) {
		// static을 선언하여 밑에 main 메소드에 직접 사용, static 선언이 없으면 밑에 객체 선언하여 사용해야
		int score = 0;
		while (true) {
			System.out.print(subject + " >> ");
			score = scan.nextInt();
			if(score < 0 || score > max) {
				System.out.println(subject +"의 범위는 0부터 "+ max +"까지 입니다.");
			} else {
				break;
			}
		}
		return score;
	}

	public static void main(String[] args) {
		// 어레이리스트 객체 생성
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=0; i<3; i++) {
			// 해시맵 객체 생성
			HashMap<String, Object> map = new HashMap<>();
			// 입력값 저장
			// 이름
			System.out.print("이름 >> ");
			map.put("name", scan.next());
			// 점수
			map.put("java", scoreFunc("자바", 40));			
			map.put("oracle", scoreFunc("오라클", 35));
			map.put("html", scoreFunc("html", 25));
			
			// 어레이리스트 저장
			list.add(map);
		}
		
		// 리스트에 있는 모든 사람의 정보를 출력
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> info = list.get(i);
			int sum = (int) info.get("java") + (int) info.get("oracle") + (int) info.get("html");
			System.out.println("이름 : "+ info.get("name") + ", 총점 : " + sum);
		}
	}
}
