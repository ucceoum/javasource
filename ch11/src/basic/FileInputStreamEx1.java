package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		OutputStream os = null;
		try {
			fis = new FileInputStream("d:\\temp\\test2.txt");
			os = System.out;
			
			int input = 0;
			while((input = fis.read()) != -1) {
				os.write(input);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
