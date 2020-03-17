package basic;

public class NumberException2 {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "a100";
		
		
		try {
			int value1 = Integer.parseInt(data1);
			
			
			//java.lang.NumberFormatException
			int value2 = Integer.parseInt(data2);
		}catch(NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("숫자를 확인해 주세요");
		}
		
		
		
		
		
		
		
		
	}

}
