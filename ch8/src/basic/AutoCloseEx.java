package basic;

public class AutoCloseEx {

	public static void main(String[] args) {
		
		AutoCloseTest auto = new AutoCloseTest("file.txt");
		
		try {
			auto.read();
			throw new Exception("강제 예외 발생");
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				auto.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
