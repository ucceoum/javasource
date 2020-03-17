package basic;

public class AccountEx {

	public static void main(String[] args) {
		
		Account account = new Account();
		
//		try {
//			account.withdraw(100000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		try {
			account.withdraw(100000);
		} catch (BalanceInsufficientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
