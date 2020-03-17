package basic;

import java.util.Scanner;

public class MiniCalc {

	public static void main(String[] args) {
		//사용자로부터 두개의 숫자와 연산자(+,-,*,/)를 입력받아 
		//사칙연산을 하는 프로그램 작성하기
		//switch case 연산자 기호
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연산자 : ");
		String str1 = sc.nextLine();
		System.out.print("첫번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = sc.nextInt();
		
		
		
		
		
		int result=0;
		
		switch (str1) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
		default:
			
			break;
		}
		
		System.out.println(num1+" "+str1+" "+num2+" = "+result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
