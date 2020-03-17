package basic;

public class AutoCloseTest implements AutoCloseable{

	
	private String file;
	
	public AutoCloseTest(String file) {
		this.file = file;
	}
	
	public void read() {
		System.out.println(file+"를 읽습니다.");
	}
	
	
	@Override
	public void close() throws Exception {
		System.out.println(file+"를 닫습니다.");
	}
	
	
	
	
}
