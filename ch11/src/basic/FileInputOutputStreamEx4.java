package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStreamEx4 {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		try(FileInputStream fis = new FileInputStream("d:\\temp\\photo2.jpg");
				FileOutputStream fos = new FileOutputStream("d:\\temp\\photo2_copy.jpg")){
			int data = 0;
			while((fis.read(b)) != -1) {
				fos.write(b);
								
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
