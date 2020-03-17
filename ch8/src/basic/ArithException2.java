package basic;

public class ArithException2 {

	public static void main(String[] args) {
		
		
		try {
			int num1 = 3, num2 = 0;
			//java.lang.ArithmeticException
			System.out.println(num1/num2);
		}catch(ArithmeticException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		
		
		
		
		
		
	}

}
