package basic;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String str1 = sc.nextLine();
		
		
		switch (str1) {
		case "A":
		case "a":
			System.out.println("A 입니다.");
			break;
		default:
			System.out.println("A가 아닌 문자열입니다");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
