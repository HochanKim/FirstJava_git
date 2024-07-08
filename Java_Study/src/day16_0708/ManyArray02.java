package day16_0708;

public class ManyArray02 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int num = 0;
		while (num < 10) {
			int row = (int) (Math.random()*4);
			int col = (int) (Math.random()*4);
			
			if (arr[row][col] != 0) {
				continue;
			} else {
				arr[row][col] = ++num;
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
