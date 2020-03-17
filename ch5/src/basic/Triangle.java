package basic;

public class Triangle {
	//밑변
	int baseLine;
	//높이
	int height;
	

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(int baseLine, int height) {
		super();
		this.baseLine = baseLine;
		this.height = height;
	}

	//메소드
	//삼각형의 너비 구하기 double getArea()
	



	double getArea() {
		
		return baseLine*height/2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
