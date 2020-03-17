package basic;

import java.util.Scanner;

public class BreakContinueEx1 {

	public static void main(String[] args) {
		
		int menu = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. square");
			System.out.println("2. square root");
			System.out.println("3. log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. 종료(0)");
			
			menu = sc.nextInt();
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(!(menu >= 1 && menu <=3)) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				System.out.println("메뉴를 다시 선택해 주세요");
				continue;
			}
			System.out.println("선택한 메뉴는 "+menu);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
