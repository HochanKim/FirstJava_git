package day02_0618;

public class For01 {

	public static void main(String[] args) {
		
		for(int a = 1; a <= 10; a++) {	// for (선언문; 조건문; 증감식) 
			System.out.println(a);
		}
		System.out.println();
		
		for(int b = 10; b >= 1; b--) {	// for (선언문; 조건문; 증감식) 
			System.out.println(b);
		}
		System.out.println();
		
		for(int c = 1; c <= 10; c++) {	// for (선언문; 조건문; 증감식)
			if (c % 2 == 1) {
				System.out.println(c);
			}
		}
		System.out.println();
		
		for(int d = 1; d <= 10; d++) {	// for (선언문; 조건문; 증감식)
			if (d % 2 == 0) {
				System.out.println(d);
			}
		}
	}

}
