package basic;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Input String : ");			//
		sc.nextLine();									//int는 위에서 숫자만 읽어가기 때문에 남아있는 '엔터'를 처리해준다.
		String str = sc.nextLine();						//nextLine은 '엔터'까지 한줄을 읽음
//		String str = sc.next();
		System.out.println("Input Num2 : ");
		int num2 = sc.nextInt();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
