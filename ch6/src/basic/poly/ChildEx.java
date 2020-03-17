package basic.poly;

public class ChildEx {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		
		//parent 접근 범위 : 부모가 가지고 있는 변수, 메소드
		//단, 자식이 오버라이드된 메소드를 가지고 있따면
		//메소드는 오버라이드된 자식 메소드가 실행된다.
		Parent parent = child;
//		child.name = "a1";
//		Parent parent = new Parent();
		
		
		parent.method();
		parent.method2();
//		parent.method3();	(X)
		Child child2 = (Child) parent;
		
		child2.method3();
//		child.method3();
//		System.out.println("======");
//		System.out.println(child.name);
		
		//ClassCastException
		//부모객체를 생성해서 자식객체의 참조변수로 사용 불가
		//Child child3 = (Child) new Parent();
		
		
		
//		System.out.println();
//		child.method();
//		child.method2();
//		child.method3();
		
	}

}
