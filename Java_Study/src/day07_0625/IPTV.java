package day07_0625;

public class IPTV extends ColorTV {
	String ipadr;	// ip주소
	
	IPTV (String ipadr, int size, int color) {
		super(size, color);
		this.ipadr = ipadr;
	}
	
	void printProperty() {
		// 나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
		System.out.println("나의 IPTV는 "+ ipadr +"주소의 "+ getSize()+"인치 "+color+"컬러");
//		System.out.print("나의 IPTV는 "+ ipadr +" 주소의 ");
//		super.printProperty();	// 부모 클래스의 출력문 가져오기 ('32인치 1024컬러')
	}
}
