package pack_abstract;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sendCall() {
		// 인터페이스 메소드 재정의
		System.out.println("띠리리리링");
	}

	@Override
	public void receiveCall() {
		// 인터페이스 메소드 재정의
		System.out.println("전화가 왔습니다.");
	}
	
	public void flash() {
		System.out.println("휴대폰 불이 켜졌다.");
	}
	
}
