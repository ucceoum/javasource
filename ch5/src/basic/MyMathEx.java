package basic;

public class MyMathEx {

	public static void main(String[] args) {
		MyMath math = new MyMath();
		
		System.out.println("math.add(3,3) : "+math.add(3, 3));
		System.out.println("math.add(3L,3) : "+math.add(3L, 3));
		System.out.println("math.add(3,3L) : "+math.add(3, 3L));
		System.out.println("math.add(3,3) : "+math.add(3, 3));
		System.out.println("math.add(3L,3L) : "+math.add(3L, 3L));
		
		
		int a[] = {100,200,300};
		System.out.println("math.add(a) : "+math.add(a));
		
		
		
		
		
		
	}

}
