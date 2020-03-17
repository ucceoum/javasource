package basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx2 {

	public static void main(String[] args) {
		
		//성능향상 보조 스트림
		try (	FileInputStream fis = new FileInputStream("d:\\temp\\photo2.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("d:\\temp\\phto2_copy2.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {
			
			//buffer에서 읽고 buffer 쓰고
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
