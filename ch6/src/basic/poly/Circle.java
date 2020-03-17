package basic.poly;

public class Circle {
	String str;
	Point point; 	//null
	int r;			//0
	
	public Circle() {
		this(new Point(0, 0),100);
		
	}

	public Circle(Point point, int r) {
		super();
		this.point = point;
		this.r = r;
	}
	
	
	void draw() {
		System.out.println("point x = "+point.x+" , "+"point y = "+point.y);
	}
	
	
	
	
	
	
	
	
}
