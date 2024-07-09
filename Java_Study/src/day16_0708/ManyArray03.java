package day16_0708;
// 1. (0.0) ~ (2.2) 까지는 1부터 10까지 랜덤한 숫자
// 2. 각 행의 마지막 열은 해당 행의 총 합
// 3. 마지막행 각 열은 앞선 동일 위치 열들의 총 합
// 4. (3,3)은 전체 총 합

public class ManyArray03 {

	public static void main(String[] args) {
		int arr[][] = new int[4][4];	// arr.length = 4, arr[].length = 4
		// [0][0] ~ [2][2]은 1~9 랜덤 숫자 넣기
		int rowLast = arr.length - 1;
		int colLast = arr[0].length - 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i != rowLast && j != colLast) {
					arr[i][j] = (int) (Math.random() * 10 + 1);
					arr[i][colLast] += arr[i][j];
					arr[rowLast][j] += arr[i][j];
					arr[rowLast][colLast] += arr[i][j];
				}
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
