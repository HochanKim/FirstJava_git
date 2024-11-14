package over;

class Point {
	   // 필드
	   private int x, y;
	   
	   // 기본 생성자
	   public Point() {
		   
	   }
	   
	   // 일반 생성자
	   public Point(int x, int y) { 
		   this.x = x; 
		   this.y = y; 
	   }
	   
	   // 메소드
	   public int getX() { return x; }
	   public int getY() { return y; }
	   protected void move(int x, int y) { this.x =x; this.y = y; }
	}
