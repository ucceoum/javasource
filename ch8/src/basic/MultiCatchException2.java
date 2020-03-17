package basic;

public class MultiCatchException2 {

	public static void main(String[] args) {
		
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 요소를 확인해 주세요");
		}catch(NumberFormatException e) {
			System.out.println("입력값을 확인해 주세요");
		}
		
		
		
		
	}

}
