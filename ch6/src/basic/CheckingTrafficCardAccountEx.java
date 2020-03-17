package basic;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		
		String owner= "송중기";
		String accountNo = "111-11-111";
		int balance = 500000;
		String cardNo = "5469-4568-7235-7123";
		boolean hasTrafficCard = true;
		
		
		
		
		
		CheckingTrafficCardAccount traffic = new CheckingTrafficCardAccount(owner,accountNo,balance,cardNo,hasTrafficCard);
		
		//예금하다
		traffic.deposit(100000);
		
		System.out.println("현재 잔액 : "+traffic.balance);
		
		
		//출금하다
		try {
			traffic.withdraw(300000);
			System.out.println("출금 후 현재 잔액 : "+traffic.balance);
			//직불카드 사용액을 지불한다.
			
			traffic.pay("5469-4568-7235-7123",100000);
			System.out.println("직불카드 사용 후 현재 잔액 : "+traffic.balance);
			
			//교통카드 사용액을 지불한다.
			traffic.payTrafficCard("5469-4568-7235-7123", 2300);
			System.out.println("교통카드 사용 후 현재 잔액 : "+traffic.balance);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
	}

}
