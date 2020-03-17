package basic;

public class ObjectEx {

	public static void main(String[] args) {
		
		Object object1 = new Object();
		Object object2 = new Object();
		
		
		System.out.println(object1.toString());
		System.out.println(object2.toString());
		
		
		//equals (주소비교)
		System.out.println(object1.equals(object2));
		
		
		
		//객체의 해시코드 값
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		
	}

}
