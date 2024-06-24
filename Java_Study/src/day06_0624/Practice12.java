package day06_0624;

import java.util.Arrays;

// 1. 클래스와 객체의 관계에 대해 주석으로 작성해시오.
// => '클래스'는 객체를 만드는데 사용되는 것이고 '객체'는 클래스를 기반으로 생성된 물체와 같다.

public class Practice12 {

	public static void main(String[] args) {
		// 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
		
		// 객체명 : hong, 이름 : 홍길동, 학번 : 1234
		Student hong = new Student(1234, "홍길동");	// 'hong' 객체 생성
		// 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
		Student yu = new Student(1357, "유재석", "컴퓨터학과");	// 'yu' 객체 생성
		
		// hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
		hong.setInfo(20, "남");
		
		// hong 객체에서 getAge 호출 후 해당 값 출력 
		int age = hong.getAge();
		System.out.println(age);
		
		// 객체의 레퍼런스만 전달
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = arr1;	// 배열 객체 'arr1'의 주소를 'arr2'에게 공유 (주소값 : 77556fd)
		arr2[0] = 10000;
		// 주소값 출력 => 둘 다 77556fd
		System.out.println(arr1);
		System.out.println(arr2);
		
		// 같은 배열 값 출력 => 주소를 공유하기 때문에 같은 배열 값이 나옴 => 둘 다 [10000, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
