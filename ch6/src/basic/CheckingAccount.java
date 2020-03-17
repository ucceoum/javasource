package basic;

public class CheckingAccount extends Account {
	
	String cardNo;
	
	//직불카드 사용액을 지불한다
	//리턴타입은 int, 메소드명은 pay, 인자는 카드번호와 사용액
	
	public CheckingAccount(String owner, String accountNo, int balance, String cardNo) {
		super(owner, accountNo, balance);
		this.cardNo = cardNo;
	}
	
	
	public int pay(String cardNo, int amount) throws Exception {
//		//카드번호와 일치하고, 은행잔고가 사용액보다 많다면
//		//사용액을 지불
//		
//		if(cardNo.equals(this.cardNo) && this.balance >= amount) {
//			this.balance -= amount;
//		}
//		return this.balance;		//남은 잔액
		if(cardNo.equals(this.cardNo)) {
			return withdraw(amount);
		}
		
		
		return -1 ;
	}

	
	
	
	
	
	
	
}
