package basic;

public class SingleTon {
	
	
//	private static SingleTon singleTon = new SingleTon();
//	private SingleTon() {}
//	
//	
//	public static SingleTon getInstance() {
//		if(singleTon == null) {
//			return singleTon;
//		}
//		
//	}
//	
	//2가지 방법			SingleTon : 하나의 객체만 쓰도록
	
	private static SingleTon singleTon;			//
	private SingleTon() {}
	
	
	public static SingleTon getInstance() {
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
