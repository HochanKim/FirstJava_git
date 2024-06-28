package day10_0628;

import java.util.Scanner;

public class Practice_StringBuffer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		String txt = scan.nextLine();
		for(int i = 0; i<txt.length(); i++) {
			txt = txt.substring(1) + txt.substring(0, 1);
			System.out.println(txt);
		}
		scan.close();
	}

}
