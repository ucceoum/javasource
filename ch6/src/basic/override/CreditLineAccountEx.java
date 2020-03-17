package basic.override;

public class CreditLineAccountEx {

	public static void main(String[] args) {
		String owner = "송중기";
		String accountNo = "1111";
		int balance = 10000;		//현재 잔액
		int creditLine = 5000000;	//마이너스 한도
		
		
		CreditLineAccount credit = new CreditLineAccount(owner, accountNo, balance, creditLine);
		
		//예금한다
		int dAmount = 500000;
		System.out.println(dAmount+" 입금");
		credit.deposit(dAmount);
		System.out.println("예금후 잔액 : "+credit.getBalance());
			
		
		//출금한다. 2가지경우
			// 1
		int wAmount = 50000000;
		System.out.println(wAmount+" 출금");
		try {
			credit.withdraw(wAmount);
			System.out.println("잔액 : "+credit.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			// 2
		System.out.println();
		
		wAmount = 2000000;
		System.out.println(wAmount+" 출금");
		try {
			credit.withdraw(wAmount);	
			System.out.println("잔액 : "+credit.getBalance());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		
		
		
	}

}
