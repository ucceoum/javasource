package shop;

public class ShopLauncher {

	public static void main(String[] args) {

		MyShop2 myshop = new MyShop2();
		
		
		//이름 지정하기
		myshop.setTitle("대우 shop");
		
		//User 생성하기 
		myshop.genUser();
		
		
		//제품 생성하기
		myshop.genProduct();
		
		//시작하기 
		myshop.start();
		
		
		
	}

}
