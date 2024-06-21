package day05_0621;

public class Switch_Case01 {

	public static void main(String[] args) {
		// switch문
		int num = 7;
		switch (num) {
		case 5:
			System.out.println("5, Five");
			break;	// switch문은 'break;'가 없으면 주어진 변수값에 해당하지 않는 case도 같이 출력이 된다.
		case 10:
			System.out.println("10, Ten");
			break;
		case 15:
			System.out.println("15, Fifteen");
			break;
		default:
			System.out.println("해당없음, none");
			break;
		}

	}

}
