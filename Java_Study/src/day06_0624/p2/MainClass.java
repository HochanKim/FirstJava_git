package day06_0624.p2;

import day06_0624.p1.AClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AClass aClass = new AClass();		// 'import'를 명시하여 사용
//		aClass.default_var = "디폴트";		// 같은 패키지 내부에서만 접근이 가능하다
//		aClass.protected_var = "프로텍티드";	// 같은 패키지 내부에서만 접근이 가능하다
		aClass.public_var = "퍼블릭";
//		aClass.private_var = "프라이빗";		// 'private' 접근제어자는 같은 패키지라도 접근이 불가능하다
	}
}
