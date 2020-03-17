package test;

public class AccountEx {

	public static void main(String[] args) {
		
//		default 생성자를 호출해서 객체 생성						없을때 : The constructor Account() is undefined
		Account account1 = new Account("홍길동","111-22",100000);
		
		// 홍길동 계좌 확인
		System.out.println("계좌주 : "+account1.getOwner());
		System.out.println("계좌번호 : "+account1.getAccountNo());
		System.out.println("잔액 : "+account1.getBalance());
		
		
		
		//예금한다
		account1.deposit(1000000);
		
		System.out.println("예금 후 잔액 : "+account1.getBalance());
		
		
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
