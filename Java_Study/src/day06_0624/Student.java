package day06_0624;

/*
2. 아래 조건에 맞게 클래스를 작성하시오.
조건 1. 클래스명 : Student
조건 2. 변수 : stuNo(학번, int)
			 stuName(이름, String)
			 stuDept(학과, String)
			 age(나이, int)
			 gender(성별, String)
조건 3. 생성자 : 1. 학번, 이름 초기화 하는 생성자
			  2. 학번, 이름, 학과 초기화 하는 생성자
조건 4. 메소드 : 1. setInfo
			 (나이와 성별을 입력받아서 저장, 리턴 x)
			  2. getAge
			  (호출 시 객체의 나이 값 리턴)
조건 5. 메인 메소드에서 해당 클래스를 이용하여 객체 생성 및 호출
           1. 객체명 : hong, 이름 : 홍길동, 학번 : 1234
           2. 객체명 : yu, 이름 : 유재석 : 학번 : 1357, 학과 : 컴퓨터학과
           3. hong 객채에서 setInfo를 통해 값 입력(나이 : 20, 성별 : 남)
           4. hong 객체에서 getAge 호출 후 해당 값 출력 
*/

public class Student {
	// 'Student' 클래스의 변수들 설정
	int stuNo;			// 학번
	String stuName;		// 이름
	String stuDept;		// 학과
	int age;			// 나이
	String gender;		// 성별
	
	// 생성자 작성
	Student(int stuNo, String stuName) {		// 생성자 함수 1 => 메인 메소드에서 객체 'hong'과 연관
		// 학번, 이름 초기화 => 생성자 파라미터(매개변수)에 넣기 => (int stuNo, String stuName)
		this.stuNo = stuNo;		// 학번 초기화 (객체를 가리키는 키워드 'this')
		this.stuName = stuName;	// 이름 초기화
	}
	
	Student(int stuNo, String stuName, String stuDept) {		// 생성자 함수 2 > 메인 메소드에서 객체 'yu'와 연관
		// 학번, 이름, 학과 초기화 => 생성자 파라미터(매개변수)에 넣기 => (int stuNo, String stuName, String stuDept)
		this.stuNo = stuNo;			// 학번 초기화
		this.stuName = stuName;		// 이름 초기화
		this.stuDept = stuDept;		// 학과 초기화
	}
	
	void setInfo(int age, String gender) {	// 나이와 성별을 입력받아서 저장, 리턴 x (특정 형이 아닌 'void'로 시작)
		// 파라미터(매개변수)에 나이와 성별을 입력
		this.age = age;
		this.gender = gender;
	}
	
	int getAge() {	// 호출 시 객체의 나이 값 리턴
		// 리턴값을 받기 위해 특정 형(int, double, string 등등)으로 시작
		return age;
	}
}
