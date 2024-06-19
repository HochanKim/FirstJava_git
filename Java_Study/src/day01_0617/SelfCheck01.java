package day01_0617;

public class SelfCheck01 {

	public static void main(String[] args) {
		// 선, 후위 연산자 확인
		int num1 = 18;	// 변수명 num1
		int num2 = ++num1;	// 변수명 num2
		// 오른쪽값의 선위 연산으로 num1은 19, num2는 연산된 왼쪽값이 대입되어 19 
		num2 = num1++;	// num1의 후위 연산(덧셈)
		// 오른쪽값의 후위 연산으로 num2에 먼저 값이 대입, num2 = 19, num1은 덧셈 연산으로 20
		System.out.println(num1);	// 20
		System.out.println(num2);	// 19
		System.out.println();
		
		int num3 = 30;	// 변수명 num3
		int num4 = num3--;	// 변수명 num4 
		// 오른쪽값의 후위연산으로 num4는 연산되지 않은 num3의 값이 대입, num4 = 30, num3는 뺄셈 연산으로 29
		num4 = num3++;
		// 오른쪽값의 덧셈 후위 연산, num4 = 29, num3 = 30
		num4 = --num3;
		// 오른쪽값의 뺄셈 선위 연산, num3 = 29, num4 = 29
		System.out.println(num3);	// 29
		System.out.println(num4);	// 29
	}

}

/*
	
	1. 변수 선언 및 변수 변경
	
	String 이름 = "홍길동"; // 문자
	int 나이 = 30; // 정수(소수점 x)
	System.out.println(나이); // 30을 출력
	
	double 키 = 170.1; // 실수 (소수점 o)
	String 주소 = "인천"; // 문자
	// 참(true), 거짓(false)
	boolean 이벤트동의여부 = true;// true or false
	
	나이 = 나이 + 1;	
	System.out.println(나이); // 1증가된 31 출력 
	
	
	2. 변수 선언(한글 변수는 사용 지양, 영어로 할 것)
	
	// name : 홍길동, age : 30, height : 170.1
	// addr : 인천, eventFlg : true
	String name = "홍길동"; // 문자
	int age = 30; // 정수
	double height = 170.1; // 실수
	String addr = "인천"; // 문자
	String addrNum = "30";  // 문자
	boolean eventFlag = true; // 참, 거짓
	// 자바에서 문자열(String)의 덧셈은 가능
	// 다만, 수학적 연산 x, 텍스트 이어붙이기
	System.out.println("이름 : " + name);
	System.out.println(name + "님의 나이는 " + age + "살 입니다.");
	
	System.out.print("나이 : ");
	System.out.println(age);
	
	
	3. 증감연산자(선위, 후위)
	
	int num1 = 10;
	int num2 = num1++; // num2=10, num1=11
	num2 = --num1; // num2=10, num1=10
	num2 = num1--; // num2=10, num1=9
	System.out.println(num1);
	System.out.println(num2);
	
	
	4. 부등호, 사칙연산, and, or
	
	int num1 = 10;
	int num2 = 15;
	int num3 = 15;
	
	System.out.println(num1 > num2); // false
	System.out.println(num2 <= num3); // true
	System.out.println(num2 == num3); // true
	System.out.println(num1 != num2); // true
	System.out.println(!true); // false
	System.out.println(num1+num2 > num3); // true
	System.out.println(7 / 2 > 3); // false
	System.out.println(7 % 2 == 0); // %(나머지 연산), false
	
	// and, or (num1 = 10, num2 =15, num3=15)
	// true and true => true
	System.out.println(num2>num1 && num2 >= num3);
	
	// false or true => true 
	System.out.println(num1>num2 || num2 >= num3);
	
	* and, or 참고
	// and , or
	
	true and true => true
	true and false => false
	false and true => false
	false and false => false
	
	true or true => true
	true or false => true
	false or true => true
	false or false => false
	false or false => false
 
 */
