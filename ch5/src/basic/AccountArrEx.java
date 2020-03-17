package basic;

public class AccountArrEx {

	public static void main(String[] args) {
		// 타입 배열명[] = new 타입명[6]
		
		Account accountArr[] = new Account[5];
		
		accountArr[0] = new Account();
		accountArr[1] = new Account("202-11",100000);
		accountArr[2] = new Account("202-11",1200000);		
		accountArr[3] = new Account("홍길동","202-11",1200000);		
		accountArr[4] = new Account("성춘향","202-13",500000);		
		print(accountArr);
		
	}
	
	static void print(Account account[]) {
		for(Account acc : account) {
			System.out.println("계좌주 : "+acc.owner);
			System.out.println("계좌번호 : "+acc.accountNo);
			System.out.println("잔액 : "+acc.balance);
			System.out.println();
		}
	}

}
