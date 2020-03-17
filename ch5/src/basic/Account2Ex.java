package basic;

public class Account2Ex {

	public static void main(String[] args) {
		Account2 account = new Account2();
		
		account.setBalance(100000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		account.setBalance(-1000000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		account.setBalance(10000000);
		System.out.println("현재 잔고 : "+account.getBalance());
		
		
		
		
	}

}
