package basic.override;

public class CreditLineAccount extends Account {
	
	//마이너스 계좌
	
	
	//마이너스 한도 필드
	private int creditLine;

	public CreditLineAccount(String owner, String accountNo, int balance, int creditLine) {
		super(owner, accountNo, balance);
		this.creditLine = creditLine;
	}
	
	
	
	//인출한다 => 인출가능금액(예금잔액 + 마이너스한도 필드)
	@Override
	int withdraw(int amount) throws Exception {
		
		int limit = getBalance()+ creditLine;
		//인출가능금액보다 출금액이 많은 경우 잔액부족  Exception
		if(limit < amount) {
			throw new Exception("잔액부족");			
		}
		
		//적은경우에는 인출한 후 잔액 리턴
		setBalance(getBalance()-amount);
		return getBalance();
	}
	
	
	
	
	
	
	
	
}
