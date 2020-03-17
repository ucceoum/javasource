package basic.poly;

public class ChildEx2 {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		
		method1(parent);
		method2(parent);
//		
//		Parent parent2 = new Parent();
//		method1(parent2);
//		method2(parent2);
//		
}
	
	
	public static void method1(Parent p) {
		// instanceof : 객체타입 확인
		if(p instanceof Child) {
			Child c = (Child)p;
			System.out.println("method1 - Child 객체로 변환 성공");
			
		}else {
			System.out.println("method1 - Child 객체로 변환 실패");
		}
	}
	
	
	
	 
	public static void method2(Parent p) {
		Child c = (Child)p;
	}
	
	
	
}
