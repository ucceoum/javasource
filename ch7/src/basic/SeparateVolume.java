package basic;


//단행본
public class SeparateVolume implements Lendable {

	
	String requestNo;		//청구번호
	String bookTitle;		//제목
	String writer;			//작가
	String borrower;		//대출인
	String checkOutDate;	//대출일
	byte state;				//대출상태
	
	
	
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	@Override
	public void checkout(String borrower, String date) {
		if(state!=0) {
			return;
		}
		this.borrower = borrower;
		this.state = 1;
		this.checkOutDate = date;
		System.out.println("*** "+bookTitle+"이(가) 대출됨");
		System.out.println("대출인 : "+this.borrower);
		System.out.println("대출일 : "+this.checkOutDate);
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutDate=null;
		this.state=0;
	}

	
	
	
	
	
}
