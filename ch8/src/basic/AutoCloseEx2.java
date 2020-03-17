package basic;

public class AutoCloseEx2 {

	public static void main(String[] args) {
		
		
		try(AutoCloseTest auto = new AutoCloseTest("file.txt")) {
			auto.read();
			throw new Exception("강제 예외 발생");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
	}
}
