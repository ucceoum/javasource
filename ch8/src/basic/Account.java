package basic;

public class Account {
	
	private long balance;
	
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public void withdraw(int amount) throws BalanceInsufficientException/* throws Exception*/ {
		if(balance < amount) {
//			throw new Exception("잔고부족");
//			throw new RuntimeException("잔고부족");
			throw new BalanceInsufficientException("잔고부족");
		}
		balance = balance - amount;
	}
	
	
	
	
	
	
	
}
