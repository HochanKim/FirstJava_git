package day06_0624.p2;

import day06_0624.p1.AClass;

public class C_Class extends AClass {	// 클래스 상속
	void sample() {
		public_var = "퍼블릭";
		protected_var = "프로텍티드";		// 패키지는 다르지만 'AClass'에게 상속받은 클래스라서 접근은 가능하다.
//		default_var = "디폴트";
//		private_var = "프라이빗";
	}
}
