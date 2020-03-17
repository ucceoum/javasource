package basic;

public class SingleTonEx {

	public static void main(String[] args) {
//		SingleTon single = new SingleTon();
		SingleTon single1 = SingleTon.getInstance();
		SingleTon single2 = SingleTon.getInstance();
		
		System.out.println(single1 == single2 ? "같은 객체" : "다른 객체");
		
		
		
		
		
	}

}
