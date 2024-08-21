package collection01;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// 문자열 데이터 (ex. 자바, 오라클, html, jsp)
		// 배열 방식 -> String str[] = new String[4];
		ArrayList<String> strList = new ArrayList<String>();	// ArrayList<> 객체 생성 (객체명 strList)
		strList.add("자바");
		strList.add("오라클");
		strList.add("html");
		strList.add("jsp");
		// [자바, 오라클, html, jsp]
		
		System.out.println(strList.get(1));		// '오라클' 출력
		
		// [자바, 오라클, html, jsp] 전부 출력
		for(int i=0; i<strList.size(); i++) {
			System.out.print(strList.get(i));
		}
		
		// 수 데이터 (ex. 10, 30, 50, 100)
		ArrayList<Integer> numList = new ArrayList<>();		// 제네릭 타입(<'???'>) 생략 가능
		
		// 모든 데이터 (ex. 홍길동, 35, 서울, 3.14, new HashMap<String, Integer> map
		ArrayList<Object> objList = new ArrayList<Object>();
		objList.add("홍길동");
		objList.add(30);
		
		int a = (int) objList.get(1);	// 다운캐스팅('int')
		// 객체 'objList'는 제네릭 타입(Object)이 변수 선언 타입(int)보다 커서 다운캐스팅(cast)을 거쳐야 한다.
		
	}

}
