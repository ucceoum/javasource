package basic.override;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		String owner = "박보검";
		String accountNo = "222-56";
		int balance = 100000;
		int bonusPoint = 0;
		
		BonusPointAccount acc = new BonusPointAccount(owner,accountNo,balance,bonusPoint);
		
		
		int amount = 50000;
		acc.deposit(amount);
		System.out.println(amount+" 입금");
		
		
		System.out.println("현재 잔액 : "+acc.getBalance());
		System.out.println("현재 보너스 포인트 : "+acc.getBonusPoint());
		
		
		int amount2 = 55000;
		try {
			System.out.println(amount2+" 출금");
			System.out.println("현재 잔액 : "+acc.withdraw(amount2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
