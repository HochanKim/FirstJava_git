package day06_0624.p1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass aClass = new AClass();	// 클래스 'AClass' 접근 및 객체 'AClass' 생성
		aClass.default_var = "디폴트";
		aClass.protected_var = "프로텍티드";
		aClass.public_var = "퍼블릭";
//		aClass.private_var = "프라이빗";	// 'private' 접근제어자는 같은 패키지라도 접근이 불가능하다
	}
}
