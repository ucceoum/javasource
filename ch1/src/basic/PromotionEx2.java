package basic;

public class PromotionEx2 {

	public static void main(String[] args) {
		int i1=10;
		double d1=5.5;
		
		double result=i1+d1;
		// 산술 연산시 큰 타입으로 자동 타입 변환 일어남
		
		int result1=i1+(int)d1;
		
		System.out.println(result);
		System.out.println(result1);

	}

}
