package over;

public class StaticMain {

	public static void main(String[] args) {
		Static don1 = new Static();
		don1.money1 = 9000;
		don1.money2 = 9000;
		System.out.println(don1.money1);
		System.out.println(don1.money2);
		
		System.out.println();
		
		Static don2 = new Static();
		don2.money1 = don2.money1 - 2000;
		don2.money2 = don2.money2 - 2000;
		System.out.println(don2.money1);
		System.out.println(Static.money2);
	}

}
