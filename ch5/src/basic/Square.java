package basic;

public class Square {
	//한 변
	int sideLength;

	//생성자
	public Square() {
		super();
	}

	public Square(int sideLength) {
		super();
		this.sideLength = sideLength;
	}
	
	//getArea()
	int getArea() {
		return sideLength*sideLength;
	}
	
	
	
	
	
}
