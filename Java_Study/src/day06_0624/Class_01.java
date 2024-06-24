package day06_0624;

public class Class_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human_Private hong = new Human_Private();
		
		// 객체 직접 접근
//		hong.name = "홍길동";
//		hong.age = 30;
//		hong.addr = "인천";
		
		// 간접 접근을 통한 변수 사용
		hong.setName("홍길동");
		hong.setAge(30);
		hong.getName();
	}
}
