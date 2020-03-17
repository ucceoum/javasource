package basic;

public class PrimitiveParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x : "+d.x);
		
		
		change(d.x);
		System.out.println("After change() x : "+d.x);;
		
		
		
		
		
		
		
	}
	
	static void change(int x) {	//값 복사
		x = 1000;
		System.out.println("change x : "+x);
	}
	
	
	
	
	
	
	
	

}
