package day08_0626;

public class CarMain {

	public static void main(String[] args) {
		// 클래스를 통해 객체를 구체화
		Car sonata = new Car();		// 객체명 : sonata
		// 'Car sonata' => 레퍼런스 변수 'sonata' 선언
		// 'new Car(); => 클래스 'Car'와 같은 이름의 객체를 생성
		sonata.name = "좋은 차";
		sonata.speed = 100;
		sonata.setName();	// 호출만 하고 끝나는 set() 메소드
		
		// 반환한 값을 형태(data type)에 맞게 출력하기
		// 반환값(return) : name (data type : 문자열)
		String name = sonata.getName();
		System.out.println(name);
		
		sonata.speedUp(50);
		sonata.speedDown(150);
		
	}

}
