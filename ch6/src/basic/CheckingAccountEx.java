package basic;

public class CheckingAccountEx {

	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount("홍길동","3456-7890",100000,"111-22-333");
		
		//직불카드 사용액을 지불
		try {
			int result = checkingAccount.pay("111-22-333",500000);
			if(result >= 0) {
				System.out.println("현재 잔액 : "+result);
			}else if(result == -1) {
				System.out.println("카드 번호 확인");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		checkingAccount.
	}

}
