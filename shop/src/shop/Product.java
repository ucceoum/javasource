package shop;

public abstract class Product {
	
	
	private String pname;
	private int price;
		
	
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public void printDetail() {	//pname, price 출력
		System.out.println("상품 이름 : "+this.pname);
		System.out.println("상품 가격 : "+this.price);
				
	}
	
	
	public abstract void printExtra();
	
}
