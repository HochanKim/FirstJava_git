package over;

public class Calc {
	// 오버로딩
	// 동일한 이름의 메소드를 여러개 정의하는거, 파라미터의 개수나 타입으로 구분
	
	int sum() {
		return 0;
	}
	
	int sum(int x, int y) {
		return x+y;
	}
	
	int sum(int x, int y, int z) {
		return x+y+z;
	}
	
	double sum(double x, double y) {
		return x+y;
	}
	
	double sum(int x, double y) {
		return x+y;
	}
}
