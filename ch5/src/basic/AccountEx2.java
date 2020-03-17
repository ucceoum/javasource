package basic;

public class AccountEx2 {

	public static void main(String[] args) {
		
//		default 생성자를 호출해서 객체 생성						없을때 : The constructor Account() is undefined
		Account account1 = new Account("홍길동","111-22",100000);
		Account account2 = new Account("성춘향","111-23",200000);
		Account account3 = new Account("송중기","111-24",300000);
		
		// 홍길동 계좌 확인
		print(account1);
		
		// 성춘향 계좌 확인
		print(account2);
		// 송중기 계좌 확인
		print(account3);
		
		
		
		
		//예금한다
		account1.deposit(1000000);
		
		System.out.println("예금 후 잔액 : "+account1.balance);
		
		
		//출금한다.
		try {
			System.out.println("출금 후 잔액 : "+account1.withdraw(500000));
			System.out.println("출금 후 잔액 : "+account1.withdraw(700000));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//출금한다.
		
		
		
		
		
		
		
	}
	
	static void print(Account account ) {
		System.out.println("계좌주 : "+account.owner);
		System.out.println("계좌번호 : "+account.accountNo);
		System.out.println("잔액 : "+account.balance);
	}

}
