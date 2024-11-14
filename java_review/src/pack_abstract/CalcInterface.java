package pack_abstract;

import over.Student;

public interface CalcInterface {
// 해당 인터페이스를 구현하는 Calculator 클래스를 생성 후 아래 조건에 맞게 추상 메소드를 오버라이딩을 하시오

	int add(int x, int y); 		// 숫자 2개를 받아서 더한 후 리턴
	int addArr(int[] arr);		// 배열을 받아서 전체 합을 구한 후 리턴
	Student studentInfo(String name, int age, String addr, String stuNum);
	// 이름, 나이, 주소, 학번을 받아서 Student 객체 생성 후 리턴
	int[] changeArr(int[] arr);
	// 배열을 받아서 가장 큰 수와 작은 수 위치 바꾼 후 리턴
}
