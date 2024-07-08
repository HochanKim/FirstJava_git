package day16_0708;

import java.io.*;

public class FileReaderEx {

	public static void main(String[] args) {
		// 자바 입출력 스트림
		FileReader fin = null;	// 출력 스트림 객체 'fin' 선언
		try {
			// 스트림 객체 'fin'에 텍스트 파일 연결
			fin = new FileReader("file\\system.ini");
			int c;
			while((c = fin.read()) != -1) {
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}