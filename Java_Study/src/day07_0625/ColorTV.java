package day07_0625;

public class ColorTV extends TV {
	int color; // 컬러
	
	ColorTV (int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		// 32인치 1024컬러
		// 상속받은 'getSize()' 변수를 프린트문에 넣어야 맞는다
		System.out.println(getSize() +"인치 "+ color +"컬러");	
	}	
}
