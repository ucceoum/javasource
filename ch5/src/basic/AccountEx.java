package basic;

public class AccountEx {

	public static void main(String[] args) {
		
//		default 생성자를 호출해서 객체 생성						없을때 : The constructor Account() is undefined
		Account account1 = new Account("홍길동","111-22",100000);
		Account account2 = new Account("성춘향","222-22",100000);
		
		
		
		if(account1 == account2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 홍길동 계좌 확인
		System.out.println("계좌주 : "+account1.owner);
		System.out.println("계좌번호 : "+account1.accountNo);
		System.out.println("잔액 : "+account1.balance);
		
		
		
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

}
