package basic;

public class ProductEx {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		System.out.println("p1 제품 번호(serial no) : "+product1.serialNo);
		System.out.println("p2 제품 번호(serial no) : "+product2.serialNo);
		System.out.println("p3 제품 번호(serial no) : "+product3.serialNo);
		System.out.println("생산된 제품의 수 : "+Product.count+"개");
		
		
	}

}
