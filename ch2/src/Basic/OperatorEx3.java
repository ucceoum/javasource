package Basic;

public class OperatorEx3 {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z;
		
		x++;
		++x;
		System.out.println("x = "+x);
		System.out.println("----------------------");

		y--;
		--y;
		System.out.println("y = "+y);
		System.out.println("----------------------");
		
		// = : 대입연산자
		// x++ : 다른 연산을 수행한 후에 값을 1증가시킴
		
		
		
		z=x++; // z=x;    x=x+1
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("----------------------");
		
		
		// x=13, y=18
		z = ++x + y++;	// z = ++x + y;	           y=y+1;
		System.out.println("z = "+z);
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		System.out.println("----------------------");
		
	}

}
