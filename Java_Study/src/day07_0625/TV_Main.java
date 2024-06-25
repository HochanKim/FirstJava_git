package day07_0625;

public class TV_Main {

	public static void main(String[] args) {
		// 클래스 'ColorTV'에 접근하여 객체 'myTV' 생성
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		// 클래스 'IPTV'에 접근하여 객체 'iptv' 생성
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); 	//"192.1.1.2" 주소에 32인치, 2048컬러
		iptv.printProperty();
	}

}
