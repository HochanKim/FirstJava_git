package special;

public class PointMain_03 {
	/*
	 결과값 :
		(1,2,3) 의 점입니다.
		(1,2,4) 의 점입니다.
		(10,10,3) 의 점입니다.
		(100,200,300) 의 점입니다.
	*/
	public static void main(String[] args) {
		
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		System.out.println(p.toString()+"입니다.");
		p.moveUp(); // z 축으로 위쪽 이동
		System.out.println(p.toString()+"입니다.");
		p.moveDown(); // z 축으로 아래쪽 이동
		p.move(10, 10); // x, y 축으로 이동
		System.out.println(p.toString()+"입니다.");
		p.move(100, 200, 300); // x, y, z축으로 이동
		System.out.println(p.toString()+"입니다.");
	}

}
