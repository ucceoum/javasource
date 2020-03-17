package basic.modifier;

public class CheckingTrafficCardAccount extends CheckingAccount {

	private boolean hasTrafficCard;
	
	
	
	
	public CheckingTrafficCardAccount(String owner, String accountNo, int balance, String cardNo, boolean hasTrafficCard) {
		super(owner, accountNo, balance, cardNo);
		this.hasTrafficCard = hasTrafficCard;
	}

	//교통카드 사용액을 지불
	int payTrafficCard(String cardNo, int amount) throws Exception {
		// 교통카드 기능이 있다면 
		//카드번호가 일치하는지 확인, 교통카드 사용액이
		//잔액보다 적은지 확인해서 잔액에서 출금해주기
		
		if(this.hasTrafficCard) {
//			if(cardNo.equals(this.cardNo) && this.balance >= amount) {
//				this.balance -= amount;
//				return this.balance;
//			}else {
//				return this.balance;
//			}
//		}else {
			
			return pay(cardNo,amount);
		}
			return -1;
//		}
		
		//교통카드 기능이 없다면 -1 리턴
		
	}
	
	
	
	
	
	
	
}
