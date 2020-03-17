package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotException2 {

	public static void main(String[] args) {
		
		//Finally 안에 자원해제를 하지 않아도 됨
		//AutoCloseable 가 구현되어 있어 자동으로 close() 가 호출됨
		try (FileInputStream fis = new FileInputStream("d:\\new.txt");) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
