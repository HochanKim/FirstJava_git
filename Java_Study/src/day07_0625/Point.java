package day07_0625;

class Point {
	   private int x, y;	// 정수형 변수 x, y
	   public Point(int x, int y) { this.x = x; this.y = y; }	// 생성자
	   public int getX() { return x; }	// getX 메소드
	   public int getY() { return y; }	// getY 메소드
	   protected void move(int x, int y) { this.x =x; this.y = y; }	// move 메소드 (상속자 지정), 점의 좌표 출력
	}
