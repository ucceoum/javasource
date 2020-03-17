package bank;

import java.util.Scanner;

public class BankApp {
	static Scanner sc = new Scanner(System.in);
	static Account[] account = new Account[50];		

	public static void main(String[] args) {
				;
		//Account 객체를 50개 생성
		//Account 객체를 담을 배열 생성
		boolean run = true;	
		//사용자로부터 정보를 받아서 객체를 생성
		while(run) {
			System.out.println("===================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("===================================");
			System.out.print("선택 : ");
			
			int menu = sc.nextInt();
			switch(menu) {
			case 1:				//계좌생성
				createAccount();
				break;
			case 2:				//계좌목록
				accountList();
				break;
			case 3:				//예금
				deposit();
				break;
			case 4:				//출금
				withdraw();
				break;
			case 5:				//종료
				run = false;
				break;
			default:
				break;
			}
		}
		System.out.println("프로그램 종료");
	}//main end

	
	
	
	private static void createAccount() {
		//하나만 계좌생성
		//사용자로부터 계좌번호, 계좌주, 잔액 입력받기
		//입력받은 값으로 Account 객체를 생성한 후 
		//배열의 빈 방에 담은 후 메소드 종료
		System.out.print("계좌번호를 입력해 주세요 : ");
		String ano = sc.next();
		System.out.print("계좌주를 입력해 주세요 : ");
		String owner = sc.next();
		System.out.print("잔액을 입력해 주세요 : ");
		int balance = sc.nextInt();
//		Account acc = new Account(ano, owner, balance);

		for(int i =0; i < account.length; i++) {
			
			if(account[i] == null) {
				account[i] = new Account(ano, owner, balance);
		
				break;
			}
		}
		
		
	}
	
	
	private static void accountList() {
		//계좌 목록 출력
		System.out.println("------------------------------");
		for(Account acc : account) {
			if(acc != null) {
				System.out.println("계좌주 : "+acc.getOwner());
				System.out.println("계좌번호 : "+acc.getAccountNo());
				System.out.println("잔액 : "+acc.getBalance());
				System.out.println("------------------------------");
			}
		}
	}
	
	
	
	private static void deposit() {
		//예금하기
		System.out.print("예금할 계좌번호 입력 : ");
		String accNo = sc.next();
		
		Account depositAccount = findAccount(accNo);
		if(depositAccount!=null) {
			System.out.print("예금할 금액 입력 : ");
			int deposit = sc.nextInt();
			depositAccount.setBalance(depositAccount.getBalance()+deposit);
			System.out.println("입금 완료");
		}else {
			System.out.println("계좌번호를 확인해 주세요");
		}
	}
	
	
	
	private static void withdraw() {
		//출금하기
		
		System.out.print("출금할 계좌번호 입력 : ");
		String accNo = sc.next();
		
		
		Account drawAccount = findAccount(accNo);
		if(drawAccount!=null) {
			
			System.out.print("출금할 금액 입력 : ");
			int withdraw = sc.nextInt();
		
				if(drawAccount.getBalance() >= withdraw && drawAccount.getBalance() != 0 && withdraw > 0) {
					drawAccount.setBalance(drawAccount.getBalance()-withdraw);
					System.out.println("출금 완료");
				}else if(drawAccount.getBalance() < withdraw) {
					System.out.println("잔액이 부족합니다");
				}else if(withdraw <= 0) {
					System.out.println("0 이상의 금액을 입력해 주세요");
				}
				
		}else {
			System.out.println("계좌번호를 확인해 주세요");
		}
	}
	
	
	
	private static Account findAccount(String accountNo) {
		//account 배열을 돌면서 사용자가 입력한 accountNo와 일치한
		//계좌가 있는지 찾기 
		//찾은 후 그 계 account를 리턴하기
		
		Account acc1 = null;
		for(Account acc : account) {
			if(acc!=null) {
				if(acc.getAccountNo().equals(accountNo)) {
				acc1 = acc;
				}
			}
		}
		return acc1;
	}
	
	
	
	
}
