package basic.override;

public class BonusPointAccount extends Account {
	private int bonusPoint;

	public BonusPointAccount(String owner, String accountNo, int balance, int bonusPoint) {
		super(owner, accountNo, balance);
		this.bonusPoint = bonusPoint;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
	
	@Override
	void deposit(int amount) {
		//예금한다
		super.deposit(amount);
		//보너스포인트 += 예금금액의 10%
		bonusPoint += (int)(amount*0.1);
		
		
	}
	
	
	
	
	
	
	
}
