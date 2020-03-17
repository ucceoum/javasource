package basic;

public class BoxEx {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		
		
		//item -> Object 이기 때문에 아무거나 담아도 되는 상황
		//		     담겨지는 데이터에 대한 검증을 할 수 없는 상황
		box1.setItem("홍길동");
		box1.setItem(1);
		box1.setItem(3.15d);
		
		String name = (String) box1.getItem();
		Integer value = (Integer) box1.getItem();
		
		
		
		
		
		Box2<String> box2 = new Box2<String>();
		box2.setItem("홍길동");
		
		
		
		Box2<Integer> box3 = new Box2<Integer>();
		
		Box2<Person> box4 = new Box2<Person>();
				
		
		
		
		
		
		
	}

}
