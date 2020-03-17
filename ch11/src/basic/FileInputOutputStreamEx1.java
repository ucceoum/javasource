package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStreamEx1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		OutputStream os = null;
		byte[] b = new byte[100];
		try {
			fis = new FileInputStream("d:\\temp\\test1.txt");
			os = new FileOutputStream("d:\\temp\\test1_copy.txt");
			
			while((fis.read(b)) != -1) {
				os.write(b);
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
