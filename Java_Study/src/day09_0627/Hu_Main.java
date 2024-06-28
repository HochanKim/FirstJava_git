package day09_0627;

public class Hu_Main {
	
	static void humanInfo(Human h) {
		String className = "";
		if (h instanceof Student) {
//			System.out.println("이 객체는 Student 클래스 객체입니다.");
			className = "학생";
		}
		if (h instanceof Worker) {
//			System.out.println("이 객체는 Worker 클래스 객체입니다.");
			className = "직장인";
		}
		if (h instanceof Researcher) {
//			System.out.println("이 객체는 Researcher 클래스 객체입니다.");
			className = "연구원";
		}
		System.out.println("이 객체는 "+ className +" 클래스 객체입니다.");
	}
	
	static void fruitBox(Object f) {
		if (f instanceof Orange) {
			System.out.println("오렌지는 맛있다.");
		}
		if (f instanceof Apple) {
			System.out.println("사과는 비싸다.");
		}
	}

	public static void main(String[] args) {
		// 객체1 업캐스팅
		Student s = new Student("홍길동", 20);		
		Worker w = new Worker("김철수", 30);		
		Researcher r = new Researcher("박영희", 25);
		humanInfo(s);
		humanInfo(w);
		humanInfo(r);
		
		
		// 객체2 업캐스팅
		Orange o = new Orange("오렌지", "오렌지색", 1000);
		Apple a = new Apple("사과", "빨간색", 5000);
		
		fruitBox(o);
		fruitBox(a);

	}

}
