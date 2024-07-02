package day12_0702;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Scholarship_review {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	// 스캐너(입력)
		// ArrayList에 HashMap 클래스를 삽입
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		System.out.println("미래장학금관리시스템입니다.");
		
		// 이름과 학점 최대 5번 입력
		for(int i=0; i<5; i++) {
			HashMap<String, Object> grade = new HashMap<>(); // 해시맵(컬렉션)
			System.out.print("이름과 학점 >> ");
			String name = scan.nextLine();
			double score = scan.nextDouble();
			
			// "키"와 값을 같이 해시맵에 삽입
			grade.put("name", name);
			grade.put("score", score);
		}
		System.out.print("장학생 선발 학점 기준 입력 >> ");
		double cutline = scan.nextDouble();
		
		// 리스트
		System.out.print("장학생 명단 : ");
		for (int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			double score = (double) user.get(i);
			
			if (score >= cutline) {
				System.out.print(user.get("name")+" ");
			}
		}
	}

}
