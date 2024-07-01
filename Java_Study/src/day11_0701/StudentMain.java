package day11_0701;
// 1. ArraytList에 Student 클래스의 객체를 담아서 관리하기.
// 2. 1번에서 작성한 코드를 HashMap<String, Object> 형태로 변경해보기

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMain {

	public static void main(String[] args) {
		// 입력 부분
		// ArrayList 컬렉션 생성
		ArrayList <Object> rcd = new ArrayList<Object>();
		// 클래스 스캐너 객체 생성
		Scanner stu = new Scanner(System.in);
		System.out.println("학생 이름,학과,학번,학점평균을 입력하세요.");
		
		while (true) {
			System.out.print(">> ");
			String input = stu.nextLine();
			if (input.equals("그만")) {
				break;
			}
			// ','를 기준으로 문자열을 구분짓기
			StringTokenizer cut = new StringTokenizer(input, ",");
			String name = cut.nextToken();
			String dept = cut.nextToken();
			String id = cut.nextToken();
			String grade = cut.nextToken();
			double parseGrade = Double.parseDouble(grade);	// 문자열 -> 실수형 변환
			
			Student info = new Student(name,dept,id,parseGrade);
			rcd.add(info);
		}
		
		for(int i=0; i<rcd.size(); i++) {
			System.out.println("----------------------");
			System.out.println("이름 : " + ((Student) rcd.get(i)).getName());
			System.out.println("학과 : " + ((Student) rcd.get(i)).getDepartment());
			System.out.println("학번 : " + ((Student) rcd.get(i)).getId());
			System.out.println("학점 : " + ((Student) rcd.get(i)).getGrade());
			System.out.println("----------------------");
		}
		stu.close();
	}
}
