package day06_0624;

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
		
	}

}
