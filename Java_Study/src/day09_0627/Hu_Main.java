package day09_0627;

public class Hu_Main {
	
	static void humanInfo(Human h) {
		if (h instanceof Human) {
			System.out.println("이 객체는 "+h.getClass()+" 클래스 객체입니다.");
		}
	}
	
	static void fruitBox(Object f) {
		if (f instanceof Object) {
			System.out.println(f+"는 맛있다.");
		}
	}

	public static void main(String[] args) {
		// 객체1 업캐스팅
		Student s = new Student("홍길동", 30);
		Human Student = s;
		
		Worker w = new Worker("김철수", 20);
		Human Worker = w;
		
		Researcher r = new Researcher("박영희", 25);
		Human Researcher = r;
		
		humanInfo(s);
		humanInfo(w);
		humanInfo(r);
		
		// 객체2 업캐스팅
		Orange o = new Orange("오렌지", "오렌지색", 1000);
		Object orange = o;
		Apple a = new Apple("사과", "빨간색", 5000);
		Object apple = o;
		
		fruitBox(o);
		fruitBox(a);

	}

}
