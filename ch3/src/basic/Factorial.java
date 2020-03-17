package basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		//사용자로부터  factorial을 구하고 싶은 숫자를 입력받아
		//factorial을 구한다.
		//ex) 5! = 5*4*3*2*1
		
		Scanner  sc = new Scanner(System.in);
		System.out.print("팩토리얼 : ");
		int A = sc.nextInt();
		int result = 1;
		
		
		for (int i = 1; i <= A; i++) {
			result *= i;
			
		}

		System.out.printf("%d! = %d",A,result);
		
		
		
		
		
		
		
		
		
		
	}

}
