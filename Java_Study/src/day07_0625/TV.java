package day07_0625;

class TV {
	// 클래스 'TV' 생성
	  private int size;	// 사이즈
	  
	  public TV (int size) { // 생성자
		  this.size = size; 
	  }
	  
	  protected int getSize() { 
		  return size; 
	  } 
}