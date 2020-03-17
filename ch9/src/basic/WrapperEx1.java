package basic;

public class WrapperEx1 {

	public static void main(String[] args) {
		
		//기본타입 : byte, short, int, float, double, boolean, char
		//객체타입 : Byte, Short, Integer, Float, Double, Boolean, Character
		
		int i = 3;
		Integer i1 = 4;
		Integer i2 = new Integer(5);
		Integer i3 = new Integer("6");
		System.out.println(i2 + i3);
		
		
		
		Float f1 = new Float(5.0);
		Float f2 = new Float(6.0f);
		Float f3 = new Float("7.3");
		System.out.println(f1+f2+f3);
		
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		System.out.println(b1?b1:b2);
		
		
		
	}

}
