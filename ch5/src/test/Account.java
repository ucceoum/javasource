package test;

public class Account {
	//private : 다른 클래스에서 직접 접근 불가 
	// 계좌주
	private String owner;
	// 계좌번호
	private String accountNo;
	// 잔액
	private int balance;
	
	public Account(String owner, String accountNo, int balance) {
		super();
		this.owner = owner;
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public Account(String accountNo, int balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	// 생성자
//	Account(){}
	
	
	
	//예금한다 => 잔액 = 잔액 + 예금액
	//리턴타입은 없고, 메소드 이름은 deposit(예금액)
	
	void deposit(int amount) {
		this.balance +=  amount;
	}
	
	
	
	
	//출금한다 = > 잔액 = 잔액 - 출금액
	// int 값을 리턴하고, 메소드 이름은 withdraw(출금액)
	
	public String getOwner() {
		return owner;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public int getBalance() {
		return balance;
	}
	int withdraw(int amount) throws Exception {
		
		if(balance < amount) {
			throw new Exception("잔액부족");
		}
		
		
		
		balance -= amount;
		
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

