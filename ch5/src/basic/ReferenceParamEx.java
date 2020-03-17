package basic;

public class ReferenceParamEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x = 10;
		System.out.println("main() x : "+d.x);
		
		
		change(d);
		System.out.println("After change() x : "+d.x);;
		
		
		
		
		
		
		
	}
	
	static void change(Data data) {	//주소 복사
		data.x = 1000;
		System.out.println("change x : "+data.x);
	}
	
	
	
	
	
	
	
	

}
