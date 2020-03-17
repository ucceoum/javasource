package basic;

public class GoodsStock {
	//상품코드 ex) p-1025
	
	//재고수량 ex) 100, 150...
	String goodsCode;
	int stockNum;
	
	GoodsStock(){}
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode = goodsCode;
		this.stockNum = stockNum;
	}
	
	
	
	//메소드
	//재고 = 재고 + 수량 addStock(수량) 리턴타입 없음
	
	void addStock(int amount) {
		this.stockNum += amount;
	}
	
	//재고 = 재고 - 수량 subtractStock(수량) 재고수량 리턴
	
	int subtractStock(int amount) throws Exception{
		if(amount > this.stockNum)  {
			throw new Exception("재고부족");
		}
		this.stockNum -= amount;
		return this.stockNum;
	}
	
	
	
	
	
	
	
	
	
	
	
}
