package basic;

public class LendableEx {

	public static void main(String[] args) {
		
		
		Lendable lendable = new Lendable() {
			
			String borrower;
			
			
			
			@Override
			public void checkout(String borrower, String date) {
				System.out.println("잡지를 대출합니다.");
			}
			
			@Override
			public void checkIn() {
				System.out.println("잡지를 반납합니다.");
			}
		};
		
		
		
		lendable.checkout("홍길동", "2019-12-18");
		lendable.checkIn();
		
		
		
		
		
		
		
		
		
	}

}
