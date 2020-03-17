package basic;

public class GoodsStockEx {

	public static void main(String[] args) {
		GoodsStock goodsStock1 = new GoodsStock("P-1520",100);
		
		//제품확인
		System.out.println("제품코드 : "+goodsStock1.goodsCode);
		System.out.println("재고수량 : "+goodsStock1.stockNum);
		
		
		//재고수량 추가
		goodsStock1.addStock(10);
		System.out.println("현재 재고수량 : "+goodsStock1.stockNum);
		
		
		//재고수량 감소
		try {
			System.out.println("현재 재고수량 : "+goodsStock1.subtractStock(50));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
