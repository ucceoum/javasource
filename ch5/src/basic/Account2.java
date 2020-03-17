package basic;

public class Account2 {
	//잔고 필드 (balance) : 음수값은 안되고 최대 백만원 까지 저장가능
	//					 외부에서 마음대로 접근하지 못하도록 설정
	
	//setBalance, 현재잔고 출력(getBalance())	
	//setBalance 음수이거나 백만원이 넘는지 확인한 후 잔고필드에 값 할당
	//			 음수이거나 백만원이 넘으면 잔고필드의 값은 그대로 유지
	
	//getter 메소드 작성
	
	private int balance;
	static final int MAX = 1000000;
	static final int MIN = 0;
	
	
	public Account2() {
		super();
	}

	
	public void setBalance(int balance) {
		if(balance >= MIN && balance <= MAX) {
		this.balance = balance;
		}	
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
