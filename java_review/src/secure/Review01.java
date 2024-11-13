package secure;

public class Review01 {

	public static void main(String[] args) {
		String name = "김호찬";
		
		int size = name.length();
		System.out.println(size);
		
		// 예외처리 적용 예시
		try {
			char writen = name.charAt(5);
			System.out.println(writen);	
		} catch(Exception e) {
			System.out.println("범위를 벗어났다");
		}
	}

}
