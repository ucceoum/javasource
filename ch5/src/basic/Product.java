package basic;

public class Product {
	static int count = 0;	//클래스 변수
	int serialNo;			//인스턴스 변수
	
	{			//인스턴스 초기화 블럭
		++count;
		serialNo = count;
	}	
	
	
	static {		//static 변수의 초기화 (클래스 초기화 블럭)
	
	}
	
	
	
	public Product() {
		
	}
	
	
	
	
	
}
