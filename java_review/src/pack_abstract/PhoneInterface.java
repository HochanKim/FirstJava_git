package pack_abstract;

public interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() { // default 메소드
		System.out.println("** Phone **");
	}

}
