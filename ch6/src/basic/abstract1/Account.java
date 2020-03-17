package basic.abstract1;

//추상(미완성) 클래스
//객체 생성 불가
//추상(미완성) - 메소드
//일반 메소드 가질 수 있음
public abstract class Account {
	
	private String accountNo;
	private String owner;
	private int balance;
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accountNo, String owner, int balance) {
		super();  
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//추상 메소드
	public abstract void deposit(int amount);
	
	
	public void withdraw(int amount) {
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
