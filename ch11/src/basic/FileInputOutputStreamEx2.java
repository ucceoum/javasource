package basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileInputOutputStreamEx2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("d:\\temp\\photo1.jpg");
				FileOutputStream fos = new FileOutputStream("d:\\temp\\photo1_copy.jpg")){
			int data = 0;
			while((data = fis.read()) != -1) {
				fos.write(data);
								
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		
	}

}
