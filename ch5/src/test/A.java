package test;

public class A {
		//상수
		static final String NAME = "HONG";
		
		
		
		//변수
			//인스턴스 변수 -> 객체를 생성하면서 객체마다 고유한 값을 갖도록 사용
			
			private int num;
		
		
			//클래스 변수 -> A객체가 여러개 생성될 때 고정된 값으로 사용
			static int variable=100;
			
			
		//생성자 -> 객체가 생성될 때 자동호출(목적 : 속성 초기화)
		//생성자 오버로딩 -> 생성자가 여러개 올 수 있음
		public A() {}
		public A(int num) {
			this.num = num;
		}
		
		
		//메소드
			//인스턴스 메소드
			//메소드 오버로딩
			public void sum() {}
		
		
			//클래스 메소드
			public static void print() {}
		
		
		// getter, setter 메소드 (필요하다면 ...)
}
