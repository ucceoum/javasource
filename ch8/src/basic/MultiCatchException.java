package basic;

public class MultiCatchException {

	public static void main(String[] args) {
		
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
			//Multi catch 형태 (JDK 7 에서 추가됨)
			System.out.println("배열 요소를 확인하거나 입력값을 확인해 주세요");
		}
		
		
		
	}

}
