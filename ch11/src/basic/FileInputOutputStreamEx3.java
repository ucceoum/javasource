package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStreamEx3 {

	public static void main(String[] args) {
		byte[] b = new byte[100];
		try(FileInputStream fis = new FileInputStream("d:\\temp\\test2.txt");
			OutputStream os = new FileOutputStream("d:\\temp\\test2_copy.txt")) {
			
			
			while((fis.read(b)) != -1) {
				os.write(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
