package basic;
//대여
public interface Lendable {
	
	void checkout(String borrower, String date); //대출
	void checkIn();								 //반납
	
	
	
	
}
