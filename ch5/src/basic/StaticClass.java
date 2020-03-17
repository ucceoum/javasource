package basic;

public class StaticClass {
	
	int field1;
	void method1() {
	}
	
	static int field2;
	static void method2() {
	}
	
	
	
	static {
//		field1 = 30;
//		method1();
		
		field2 = 30;
		method2();
	}
	
	static void method3() {
		//this.			
//		field1 = 30;
//		method1();
		
		StaticClass obj = new StaticClass();
		obj.field1 = 10;
		obj.method1();
	}
	
}
