package day16_0708;

import java.io.*;

public class BinaryCopyEx {

	public static void main(String[] args) {
		// 바이너리 파일 복사
		File src = new File("images/img1.jpg");
		File dest = new File("images/copyimg.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath()+ "를" 
			+ dest.getPath() +"로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}

	}

}
