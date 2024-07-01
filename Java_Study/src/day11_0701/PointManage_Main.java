package day11_0701;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PointManage_Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList <Object> rcd = new ArrayList<Object>();
		System.out.println("** 포인트 관리 프로그램입니다. **");
		
		while (true) {
			System.out.print("\n이름과 포인트 입력 >> ");
			String list = scan.nextLine();
			if (list.equals("그만")) {
				break;
			}
			
			StringTokenizer split = new StringTokenizer(list, " ");
			String name = split.nextToken();
			String point = split.nextToken();
			Integer parsePoint = Integer.parseInt(point);
			
			PointManagement record = new PointManagement(name, parsePoint);
			rcd.add(record);
			
			for(int i=0; i<rcd.size(); i++) {
				System.out.print("("+((PointManagement) rcd.get(i)).getName()+","+((PointManagement) rcd.get(i)).getPoint()+")");
			}
			
			record.pointUp(parsePoint);
		}
	}
}
