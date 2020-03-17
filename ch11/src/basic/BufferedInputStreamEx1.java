package basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {

	public static void main(String[] args) {
		
		//성능향상 보조 스트림
		try (	FileInputStream fis = new FileInputStream("d:\\temp\\test3.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("d:\\temp\\test3_copy.txt");
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
