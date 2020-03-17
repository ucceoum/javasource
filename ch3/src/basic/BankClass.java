package basic;

import java.util.Scanner;

public class BankClass {

	public static void main(String[] args) {
					// 1선택한 경우
					// 예금액 입력받기
					// 잔액  = 잔액 + 예금액
					
					// 2선택한 경우
					// 출금액 입력받기
					// 잔액 = 잔액 - 출금액
					
					// 3 선택한 경우
					// 잔고 보여주기
					
					// 4 선택한 경우 
					// while문 종료
		boolean run = true;
		
		int balance = 0;	//잔액
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-----------------------");
			System.out.print("선택 >> ");
			a = sc.nextInt();
			
//			if(a==1) {
//				System.out.print("예금하실 금액 : ");
//				b = sc.nextInt();
//				
//				balance = balance + b;
//			}else if(a==2) {
//				System.out.print("출금하실 금액 : ");				
//				b = sc.nextInt();
//				
//				balance = balance - b;
//				
//			}else if(a==3) {
//				System.out.println("잔고 : "+balance);
//			}else if(a==4) {
//				break;
//			}else {
//				System.out.println("다시 선택해 주세요");
//			}
			
			
			
			switch (a) {
			case 1:
				System.out.print("예금액 : ");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출금액 : ");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고 : "+balance);
				break;
			case 4:
				run = false;
			default:
				break;
			}
			
		}
		System.out.println("은행 어플리케이션 종료");
		
		
	}

}
