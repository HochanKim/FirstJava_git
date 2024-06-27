package day08_0626;
//클래스 상속 복습 (review)

public class PointMain_02 {

	public static void main(String[] args) {
		// 결과 : BLACK색의 (0,0) 점입니다. \n RED색의 (5,5) 점입니다.
		// 객체 생성 (객체명 'zeroPoint'), 객체와 연관된 생성자 작성 필요
		ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
		System.out.println(zeroPoint.toString() + "입니다.");
				
		// 객체와 연관된 생성자 작성 필요
		// 생성자 매개변수 : (int, int), 객체명 : cp2
		ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
		cp2.setXY(5,5);
		cp2.setColor("RED");
		System.out.println(cp2.toString()+"입니다.");
		System.out.println();	
		
		// 결과값 : (1,2,3) 의 점입니다.
		// (1,2,4) 의 점입니다.
		// (10,10,3) 의 점입니다.
		// (100,200,300) 의 점입니다.
		
		// 1,2,3은 각각 x, y, z축의 값.
		// 클래스 'Point3D'에서 객체 'p'의 매개변수에 맞는 생성자 작성
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString()+"입니다.");
		
		// 객체의 값을 받는 메소드를 해당 클래스에 작성 (1)
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		
		// 객체의 값을 받는 메소드를 해당 클래스에 작성 (2)
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString()+"입니다.");
		
		// 객체의 값을 받는 메소드를 해당 클래스에 작성 (3)
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.println(p.toString()+"입니다.");
	}

}
