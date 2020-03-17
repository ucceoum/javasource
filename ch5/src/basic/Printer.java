package basic;

public class Printer {
	//메소드 오버로딩
	//리턴타입은 없음, 메소드명 println()
	//전달인자 int, boolean, double, String 값을 받아서 처리
	//기능은 전달받은 인자를 출력하기
	
	
	public static void println(int i) {
		System.out.println(i);
	}
	
	public static void println(boolean b) {
		System.out.println(b);
	}
	
	public static void println(double d) {
		System.out.println(d);
	}
	
	public static void println(String s) {
		System.out.println(s);
	}
	
	
	
	
}
