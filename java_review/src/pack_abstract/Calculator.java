package pack_abstract;

import java.lang.reflect.Array;
import java.util.Arrays;

import over.Student;

public class Calculator implements CalcInterface {

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int addArr(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		// 향상된 포문
//		for(int num : arr) {
//			sum += num;
//		}
		
		return sum;
	}

	@Override
	public Student studentInfo(String name, int age, String addr, String stuNum) {
		Student student = new Student(name, age, addr, stuNum);
		return student;
	}

	@Override
	public int[] changeArr(int[] arr) {
		int maxIndex = 0;
		int minIndex = 0;
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[maxIndex]<arr[i]) {
				maxIndex = i;
			}
			
			if(arr[minIndex]>arr[i]) {
				minIndex = i;
			}
		}
		temp = arr[maxIndex];
		arr[maxIndex] = arr[minIndex];
		arr[minIndex] = temp;
		
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[] = {5, 4, -3, 1};
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 3));
		System.out.println();
		System.out.println(calc.addArr(arr));
		System.out.println();
		Student s = calc.studentInfo("Mr.Who", 25, "시카고", "20171234");
		s.info();
		System.out.println();
		System.out.println(Arrays.toString(calc.changeArr(arr)));
	}

}
