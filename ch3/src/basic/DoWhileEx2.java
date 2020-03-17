package basic;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {

		//사용자로부터 입력을 받는 프로그램\
		//프로그램 종료는 q가 입력되면 종료
		
		System.out.println("메세지를 입력해 주세요");
		System.out.println("종료를 원하시면 q를 입력해 주세요");
		
		Scanner sc = new Scanner(System.in);
		String input="";
//		do {
//			System.out.print(">> ");
//			input = sc.nextLine();
//			System.out.println(input);
//		}while(!input.Equals("q"));
		
		while(!input.equals("q")) {
			System.out.println(">> ");
			input = sc.nextLine();
			System.out.println(input);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
