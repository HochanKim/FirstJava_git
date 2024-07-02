package day11_0701;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Scholarship {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("미래장학금관리시스템입니다.");
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		
		for(int i=0; i<5; i++) {
			HashMap<String, Object> grade = new HashMap<String, Object>();
			System.out.print("이름과 학점 >>> ");
			String name = scan.next();
			double score = scan.nextDouble();
			grade.put("name", name);
			grade.put("score", score);
			list.add(grade);
		}
		System.out.print("장학금 선발 기준 : ");
		double limit = scan.nextDouble();
		System.out.print("장학색 명단 : ");
		for(int i=0; i<list.size(); i++) {
			HashMap<String, Object> user = list.get(i);
			double score = (double) user.get("score");
			if (score >= limit) {
				System.out.print(user.get("name")+" ");
			}
		}
	}
}		

