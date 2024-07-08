package day16_0708;

import java.util.Random;

public class ManyArray01 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		Random num = new Random();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int rnd = num.nextInt(10) + 1;
				arr[i][j] = rnd;
			}
		}
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
