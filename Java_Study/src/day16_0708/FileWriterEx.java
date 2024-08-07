package day16_0708;

import java.io.*;
import java.util.*;

public class FileWriterEx {
	public static void main(String[] args) {
		// 키보드 입력을 파일로 저장
		Scanner scan = new Scanner(System.in);
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("file\\test.txt");
			while(true) {
				String line = scan.nextLine();
				if(line.length() == 0) {
					break;
				}
				fout.write(line, 0, line.length());
				fout.write("\r\n", 0, 2);
			}
			fout.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류");
		}
		scan.close();
	}
}
