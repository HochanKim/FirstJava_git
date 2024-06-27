package day09_0627;

import java.util.Arrays;

public class HumanMain {

	public static void main(String[] args) {
		// 클래스 'Human'을 받은 객체 생성
		Human hong = new Human("홍길동", 30);
		Human kim = new Human("김철수", 20);
		Human yoo = new Human("유재석", 40);
		
		hong.age = 31;
		System.out.println(hong.age);
		hong.paper -= 10;
		System.out.println(hong.paper);
		System.out.println(kim.paper);
		
		// static 선언 변수는 클래스 차원에서 접근이 가능하다
		Human.paper += 50;
		System.out.println(yoo.paper);
		
		// static 사례
		double pi = Math.PI;
//		System.out.println(Arrays.toString(null));
		
		Human suhak = new Human("누군가", 25);
	}

}
